import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Tiro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro2 extends Actor
{
    
    public void act()
    {
        move(-10);
        removeFromWorld();   
    }
    
    public void removeFromWorld() 
    {       
        if(getX() < 10) {
            getWorld().removeObject(this);
        }
    }
}


