import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWindow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWindow extends World
{
    public MainWindow()
    {    
        super(700, 500, 1);
        prepare();
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public void prepare()
    {

        Msg msg = new Msg();
        addObject(msg, 91,510);
        msg.setLocation(350,450);
        msg.setLocation(346,258);
        msg.setLocation(372,440);
        msg.setLocation(496,229);
    }
}
