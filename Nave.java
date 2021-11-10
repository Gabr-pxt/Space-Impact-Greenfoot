import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

public class Nave extends Actor
{
    public void act() // Metodo Update do Player
    {
        mover();
        atirar();
        bossHit();
    }    
    
    public void mover() // Movimentação do Player
    {
        if(Greenfoot.isKeyDown ("Up") && (getY() > 65))
        {
            setLocation ( getX(),getY() -10);
        }
        
        if(Greenfoot.isKeyDown ("Down") && (getY() < 425))
        {            
            setLocation ( getX(),getY() +10);
        }
    }    
    
    public void atirar() // Chamada do objeto Tiro 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY()); 
        }
    }
    
    public void bossHit() // Executado quando o tiro disparado pelo Boss colide com o player
    {
        Actor tiroInimigo = getOneIntersectingObject(Tiro2.class);
        
        if (tiroInimigo != null)
        {
            getWorld().removeObject(tiroInimigo);             
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            Life life = myWorld.getContador();
            life.removeLife();
        }
    }
 }
