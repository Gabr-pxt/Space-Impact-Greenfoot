import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bots2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bots2 extends Bots
{
    public void act()
    {
        moveBots();
        alvoAcertado();
    }
    
    public void alvoAcertado() {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        if (nave != null) 
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
             
             getWorld().removeObject(this);
        }
        else if (tiro != null) 
        {
             getWorld().removeObject(tiro);             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Counter counter = myWorld.getCounter();
             counter.addScore();
             
             getWorld().removeObject(this);
        }
        else if(getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
