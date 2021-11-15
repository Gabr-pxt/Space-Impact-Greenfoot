import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;


public class Tiro3 extends Actor
{
    
    public void act() // Movimentação do tiro criado a partir do Boss
    {
        move(-10);
        removeFromWorld();   
    }
    
    public void removeFromWorld() // Elimina ao colidir com uma parede
    {       
        if(getX() < 10) {
            getWorld().removeObject(this);
        }
    }
}


