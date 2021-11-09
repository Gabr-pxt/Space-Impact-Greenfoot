import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Bots
{
    int hits = 0;
    int upOrDown;
    
    public Boss1(int upOrDown)
    {
        this.upOrDown = upOrDown;
    }
    
    public void act()
    {
        moveBoss(upOrDown);
        autoFire();
        alvoAcertado();
    }
    
    public void autoFire() 
    {
        World w = getWorld();
        
        if (getY()%80 == 0)
        {
            w.addObject(new Tiro2(), getX() -120, getY() + 15);
        }
    }
    
    public void alvoAcertado()
    {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        if (nave != null) 
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
        }
        else if (tiro != null) 
        {
             getWorld().removeObject(tiro);             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Counter counter = myWorld.getCounter();
             
             hits++;
             
             if (hits == 50)
             {
                 MyWorld2 myWorld2 = (MyWorld2)myWorld;
                 myWorld2.bossIsDead = true;
                 getWorld().removeObject(this);
                 counter.addBossScore();
             }
        }
        else if(getY() <= 120) 
        {
            
            upOrDown = 1;
            
        }
        else if(getY() >= 400) 
        {
            
            upOrDown = 0;
        }
       
    }
}
