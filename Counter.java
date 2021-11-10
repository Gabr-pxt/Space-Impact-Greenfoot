import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Counter extends Actor
{
    int score = 0;
    
    public Counter() // geração do Score inicial do jogo
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, null, null));
    }
    
    public void act() // atualização do Score
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, null, null));
    }
    
    public void addScore() // Score gerado após eliminação de um bot padrão
    {
        score += 10;
    }
    
    public void addBossScore() // Score gerado após a eliminação de um boss
    {
        score += 50;
    }
}
