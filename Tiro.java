import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Tiro extends Actor
{
    
    public void act() // Movimentação do tiro criado a partir do Player
    {
        move(25);
        removeFromWorld();   
    }
    
    public void removeFromWorld() // Elimina ao colidir com uma parede
    {       
        if(getX() > 690) {
            getWorld().removeObject(this);
        }
    }
}


