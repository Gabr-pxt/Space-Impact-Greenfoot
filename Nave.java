import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * Classe que representa a nave do jogador
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Nave extends Actor
{
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act() // Metodo Update do Player
    {
        mover();
        atirar();
        bossHit();
        bulletHit();
    }    
    
    /**
     * Metodo responsavel por controlar a movimentaçao da nave de acorco com os comandos do jogador
     */
    public void mover()
    {
        if(Greenfoot.isKeyDown ("Up") && (getY() > 65))
        {
            setLocation ( getX(),getY() -10);
        }
        
        if(Greenfoot.isKeyDown ("Down") && (getY() < 425))
        {            
            setLocation ( getX(),getY() +10);
        }
    }    
    
    /**
     * Metodo responsavel por chamar os metodos dos disparos do jogador
     */
    public void atirar()
    {
        World w = getWorld();
        WorldGame world = (WorldGame) w;
        if (world.gotBullet)
            atirar2();
        else
            atirar1();
    }
    
    /**
     * Metodo que efetua o disparo do  jogador com apenas um projetil
     */
    public void atirar1() // Chamada do objeto Tiro 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY());
        }
    }
    
    /**
     * Metodo que efetua o disparo do  jogador com dois projeteis
     */
    public void atirar2() // Chamada de dois objetos Tiro 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY() - 9);
            w.addObject(new Tiro(), getX() +2, getY() + 9);
        }
    }
    
    /**
     * Metodo que verifica se um disparo de um boss atingiu a nave do jogador
     */
    public void bossHit()
    {
        Actor tiroInimigo1 = getOneIntersectingObject(Tiro2.class);
        Actor tiroInimigo2 = getOneIntersectingObject(Tiro3.class);
        if (tiroInimigo1 != null || tiroInimigo2 != null)
        {
            getWorld().removeObject(tiroInimigo1);
            getWorld().removeObject(tiroInimigo2);
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            Life life = myWorld.getContador();
            life.removeLife();
        }
    }
    
    /**
     * Verifica se a nave colidiu com um objeto da classe Bullet
     */
    public void bulletHit()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        
        if (bullet != null) //colisao sendo verdadeira o objeto Bullet e removido da tela e muda o modo de disparo da nave
        {
            getWorld().removeObject(bullet);
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            myWorld.gotBullet = true;
        }
    }
 }
