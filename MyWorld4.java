import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld4 extends WorldGame
{
    Level level = new Level(4, hudColor);
    int actualScore;
    boolean bossIsDead = false;

    
    public MyWorld4(int actualScore)
    {   
        super(700, 500, 1);
        hudColor = Color.WHITE;
        prepare();
        Greenfoot.setSpeed(51);
        actualScore = actualScore;
        counter.score = actualScore;
    }
    
    // Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots4();
        }
        
        if (counter.score >= 1000)
        {
            
        }
        
        if (counter.score == 1500 && bossIsDead)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,0));
        }
    }
    
    
    public void prepare()
    {
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(615,14); 
        life.setLocation(62,22);
        counter.setLocation(333,16);
    }
}
