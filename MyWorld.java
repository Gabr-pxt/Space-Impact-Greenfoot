import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends WorldGame
{

    Level level = new Level();
    
    public MyWorld()
    {    
        super(700, 500, 1); 
        prepare();
        Greenfoot.setSpeed(48);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots();
        }
        
        if (counter.score >= 300)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,2));
        }
    }
    
    public void prepare()
    {
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(570,25);
        Montanhas montanhas = new Montanhas();
        addObject(montanhas,358,473);
        level.setLocation(615,14);
        counter.setLocation(352,20);
        life.setLocation(62,25);
        life.setLocation(64,17);
        life.setLocation(64,18);
        life.setLocation(63,26);
        life.setLocation(59,13);
        life.setLocation(61,10);
        life.setLocation(62,22);
        counter.setLocation(334,13);
        counter.setLocation(333,16);
    }
}
