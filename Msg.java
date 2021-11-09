import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Msg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Msg extends Actor
{
    /**
     * Act - do whatever the Msg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String msg;
    int fontSize;
    
    public Msg (){
        msg = "PRESS ENTER";
        fontSize = 35;
    }
    
    public Msg (String msg, int fontSize){
        this.msg = msg;
        this.fontSize = fontSize;
    }
    
    public void act()
    {
        setImage(new GreenfootImage (msg, fontSize, null, null));
        
    }
}
