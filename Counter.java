import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Counter extends Actor
{
    int score = 0;
    
    public Counter()
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, null, null));
    }
    
    public void act()
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, null, null));
    }
    
    public void addScore()
    {
        score += 10;
    }
    
    public void addBossScore()
    {
        score += 50;
    }
}
