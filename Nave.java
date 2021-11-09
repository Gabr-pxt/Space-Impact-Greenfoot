import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    public void act()
    {
        mover();
        atirar();
        bossHit();
    }    
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
    public void atirar() 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY()); 
        }
    }
    
    public void bossHit()
    {
        Actor tiroInimigo = getOneIntersectingObject(Tiro2.class);
        if (tiroInimigo != null)
        {
            getWorld().removeObject(tiroInimigo);             
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            Life life = myWorld.getContador();
            life.removeLife();
        }
    }
 }
