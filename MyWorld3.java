import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld3 extends WorldGame
{
    Level level = new Level();
    
    int actualScore;   

    
    public MyWorld3(int actualScore)
    {    
        super(700, 500, 1); 
        prepare();
        Greenfoot.setSpeed(50);
        actualScore = actualScore;
        counter.score = actualScore;
    }
    
    // Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots3();
        }
        
        if (counter.score == 1100)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,4));
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
