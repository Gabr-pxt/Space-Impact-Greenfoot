import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    int contador = 5;
    
    public Life() 
    {
        setImage(new GreenfootImage (" " + contador, 30, null, null));
    }
    
    public void act()
    {
        setImage(new GreenfootImage (" " + contador, 30, null, null));
        youLose();
    }
    
    public void removeLife() 
    {
        if(contador > 0) 
        {
          contador = contador-1;  
        }
    }
    
    public void removeAllLifes() 
    {
        contador = 0;
    }
    
    public void youLose() 
    {
        if (contador == 0)
        {
            getWorld().addObject(new YouLose(),335,250);
            Greenfoot.stop();
        }
    }
}
