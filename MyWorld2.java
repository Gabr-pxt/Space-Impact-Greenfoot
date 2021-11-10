import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld2 extends WorldGame
{
    Level level = new Level(2);
    
    boolean bossIsDead = false;
    
    int actualScore;
    
    public MyWorld2(int actualScore)
    {    
        super(700, 500, 1);
        prepare();
        Greenfoot.setSpeed(50);
        counter.score = actualScore;
    }
   
    // Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
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
        life.setLocation(51,19); 
        level.setLocation(629,12);
        counter.setLocation(337,481);
    }
}
