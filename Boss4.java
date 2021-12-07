import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o boss que aparece na fase 04
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Boss4 extends Bots
{
    /**
     * Atributo que representa a quantidade de disparos (vindos do jogador) que o objeto recebeu
     */
    int hits = 0;
    
    /**
     * Atributo que representa a direçao para qual o objeto boss ira se mover na tela
     */
    int upOrDown;
    
    /**
     * Metodo construtor
     * 
     * @param recebe um valor que indicara a direçao que o boss ira se mover na tela
     */
    public Boss4(int upOrDown)
    {
        this.upOrDown = upOrDown;
    }
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        moveBoss(upOrDown);
        autoFire();
        alvoAcertado();
    }
    
    /**
     * Metodo que representa o sistem de dispatos do boss
     */
    public void autoFire() 
    {
        World w = getWorld();
        
        if (getY()%80 == 0)
        {
            w.addObject(new Tiro3(), getX() -120, getY() + 15); // cria um novo objeto Tiro3 dentro da cena
        }
    }
    
    /**
     * Metodo resposavel por verificar as colisoes entre os disparos do boss e a nave, e os disparos da nave e o boss
     */
    public void alvoAcertado()
    {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        
        if (nave != null) // Verifica se a colisão é com uma nave
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
        }
        else if (tiro != null) // verifica se um tiro disparado pela nave entrou em contato
        {
             getWorld().removeObject(tiro);             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Counter counter = myWorld.getCounter();
             
             hits++;
             
             if (hits >= 50) //Verifica o limite máximo da vida do Boss
             {
                 MyWorld4 myWorld4 = (MyWorld4)myWorld;
                 myWorld4.bossIsDead = true;
                 getWorld().removeObject(this);
                 counter.addBossScore();
             }
        }
        else if(getY() <= 120) //Altera a movimentação do Boss
        {
            
            upOrDown = 1;
            
        }
        else if(getY() >= 400) //Altera a movimentação do Boss
        {
            
            upOrDown = 0;
        }
    }
}
