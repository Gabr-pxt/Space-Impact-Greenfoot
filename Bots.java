import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bots extends Actor
{
    public void act()
    {
        
    }
    
    public void moveBots()
    {        
        setLocation(getX()-5, getY());
    }
        public void moveBots3()
    {        
        setLocation(getX()-3, getY());
    }
    public void moveBoss(int upOrDown)
    {
        if (upOrDown == 0)
        {
            setLocation(getX(), getY()-2);
        }
        else
        {
            setLocation(getX(), getY()+2);
        }
    }
    
    
    public void removeBots()
    {         
        if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
