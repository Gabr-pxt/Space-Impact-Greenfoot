import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Counter extends Actor
{
    int score = 0;
    Color color;
    public Counter(Color color) // geração do Score inicial do jogo
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, color, null));
        this.color = color;
    }
    
    public void act() // atualização do Score
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, color, null));
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
