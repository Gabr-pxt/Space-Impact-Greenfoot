import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bots1 extends Bots
{
    public void act()
    {
        moveBots();
        alvoAcertado();
    }
    
    
    // Verifica as colisões envolvendo o objeto dentro da cena
    public void alvoAcertado() {
        
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        
        if (nave != null)  // Verifica se a colisão ocorreu com uma nave 
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
             
             getWorld().removeObject(this);
        }
        else if (tiro != null) // Verifica se a colisão ocorreu com um tiro
        {
             getWorld().removeObject(tiro);             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Counter counter = myWorld.getCounter();
             counter.addScore();
             
             getWorld().removeObject(this);
        }
        else if(getX() == 0) //Verifica se a colisão ocorreu com uma parede
        {
            getWorld().removeObject(this);
        }
    }
}
