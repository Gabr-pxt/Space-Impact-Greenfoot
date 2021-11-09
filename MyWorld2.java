import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends WorldGame
{
    Level level = new Level(2);
    int actualScore;
    
    boolean bossIsDead = false;

    public MyWorld2(int actualScore)
    {    
        super(700, 500, 1);
        prepare();
        Greenfoot.setSpeed(50);
        counter.score = actualScore;
    }
   
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots2();
        }
        
        if (counter.score >= 600 && bossIsDead)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,3));
        }
    }
    
    public void prepare()
    {        
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(570,25);
        counter.setLocation(344,471);
        life.setLocation(65,478);
        counter.setLocation(333,482);
        level.setLocation(624,482);  
        life.setLocation(51,19);
        counter.setLocation(353,20);
        level.setLocation(629,12);
        counter.setLocation(365,18);
    }
}
