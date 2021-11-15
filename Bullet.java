import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Bots
{
    public void act()
    {
        move(-1);
        removeFromWorld();   
    }
    
    public void removeFromWorld() // Elimina ao colidir com uma parede
    {       
        if(getX() < 10) {
            getWorld().removeObject(this);
        }
    }
}
