import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa os inimigos do jogo na fase 03
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Bots3 extends Bots
{
    /**
     * Atributo que represeta a quantidade de disparos necessarios para destruir o inimigo da classe Bots3
     */
    int damageCheck = 3;
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        moveBots3();
        alvoAcertado();
    }
    
    /**
     * Metodo que verifica se houve colisoes do objeto com disparos, com a nave ou com o fim da tela
     */
    public void alvoAcertado() {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        
        if (nave != null) // Verifica se a colisão ocorreu com uma nave 
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
             
             getWorld().removeObject(this);
        }
        else if (tiro != null) // Verifica se a colisão ocorreu com um tiro e decrementa o DamageCheck
        {
             damageCheck--;
             getWorld().removeObject(tiro);
             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;      
             if(damageCheck == 0) // Verifica se DamageCheck é 0 e elimina o objeto
             {
    
                 Counter counter = myWorld.getCounter();
                 counter.addScore();
                 getWorld().removeObject(this);
             }
        }
        else if(getX() == 0) //Verifica se a colisão ocorreu com uma parede
        {
            getWorld().removeObject(this);
        }
    }
}
