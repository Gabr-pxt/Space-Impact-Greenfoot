import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bots3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bots3 extends Bots
{
    int damageCheck = 3;
    
    public void act()
    {
        moveBots3();
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
             damageCheck--;
             getWorld().removeObject(tiro);
             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;      
            
             
             if(damageCheck == 0)
             {
    
                 Counter counter = myWorld.getCounter();
                 counter.addScore();
                 getWorld().removeObject(this);
             }
             

        }
        else if(getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
