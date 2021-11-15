import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bots4 extends Bots
{
    int damageCheck = 3;
    
    public void act()
    {
        moveBots3();
        alvoAcertado();
    }
    
    public void alvoAcertado() {
        
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        
        
        if (nave != null) // Verifica se a colisão ocorreu com uma nave 
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
             
             getWorld().removeObject(this);
        }
        else if (tiro != null) // Verifica se a colisão ocorreu com um tiro e decrementa o DamageCheck
        {
             damageCheck--;
             getWorld().removeObject(tiro);
             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;      
            
             
             if(damageCheck == 0) // Verifica se DamageCheck é 0 e elimina o objeto
             {
    
                 Counter counter = myWorld.getCounter();
                 counter.addScore();
                 getWorld().removeObject(this);
             }
             

        }
        else if(getX() == 0) //Verifica se a colisão ocorreu com uma parede
        {
            getWorld().removeObject(this);
        }
    }
}
