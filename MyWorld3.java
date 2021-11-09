import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends WorldGame
{
    int actualScore;
    
    Level level = new Level();
    
    public MyWorld3(int actualScore)
    {    
        super(700, 500, 1); 
        prepare();
        Greenfoot.setSpeed(48);
        actualScore = actualScore;
        counter.score = actualScore;
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots3();
        }
        
        if (counter.score >= 900)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,4));
        }
    }
    
    public void prepare()
    {
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(570,25);
        level.setLocation(615,14);
        counter.setLocation(352,20);
        life.setLocation(62,22);
        counter.setLocation(334,13);
        counter.setLocation(333,16);
    }
}
