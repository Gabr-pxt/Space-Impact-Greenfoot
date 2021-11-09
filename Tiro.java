import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
    
    public void act()
    {
        move(25);
        removeFromWorld();   
    }
    
    public void removeFromWorld() 
    {       
        if(getX() > 690) {
            getWorld().removeObject(this);
        }
    }
}


