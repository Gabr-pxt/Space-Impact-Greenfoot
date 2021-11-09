import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int index = 1;
    
    public Level(){
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
    }
    
    public Level(int index){
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
        this.index = index;
    }
    
    public void act()
    {
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
        
    }
}
