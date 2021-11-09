import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class WordGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGame extends World
{
    Counter counter = new Counter();
    Random rand = new Random();
    Life life = new Life();   
    
    boolean bossThere;
    
    int upOrDown;
    int score = 0;
    
    public WorldGame(int a, int b, int c)
    {    
        super(a, b, c); 
    }
     
    public Counter getCounter()
    {
        return counter;
    }    
    public Life getContador()
    {
        return life;
    }    
    public void addBots()
    {
        int position = (int) (Math.random() * (400 - 65)) + 100;
        addObject(new Bots1(), 650, position);       

    }    
    public void addBots2()
    {
        if (!bossThere){
          int position = (int) (Math.random() * (400 - 65)) + 100;
        addObject(new Bots2(), 650, position);  
        }
        if (counter.score == 600 && !bossThere)
        {
            upOrDown = rand.nextInt(2);
            addObject(new Boss1(upOrDown), 650, 250);
            bossThere = true;
        }
    }
    public void addBots3()
    {
        int position = (int) (Math.random() * (400 - 65)) + 100;
        addObject(new Bots3(), 650, position);       

    }    
    public void prepare()
    {        
        Nave nave = new Nave();
        addObject(nave,81,213); 
        nave.setLocation(85,326);
        nave.setLocation(109,219);
        addObject(counter,71,472);
        counter.setLocation(356,25);    
        addObject(life,65,36);
        Coracao coracao = new Coracao();
        addObject(coracao,32,30);
        coracao.setLocation(31,20);
        life.setLocation(69,24);
        counter.setLocation(174,24);
    }
}
