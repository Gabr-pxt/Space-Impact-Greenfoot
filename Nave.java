import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

public class Nave extends Actor
{
    public void act() // Metodo Update do Player
    {
        mover();
        atirar();
        bossHit();
        bulletHit();
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
    
    public void atirar()
    {
        World w = getWorld();
        WorldGame world = (WorldGame) w;
        if (world.gotBullet)
            atirar2();
        else
            atirar1();
    }
    
    public void atirar1() // Chamada do objeto Tiro 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY());
        }
    }
    
    public void atirar2() // Chamada de dois objetos Tiro 
    {
        World w = getWorld();
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            w.addObject(new Tiro(), getX() +2, getY() - 9);
            w.addObject(new Tiro(), getX() +2, getY() + 9);
        }
    }
    
    public void bossHit() // Executado quando o tiro disparado pelo Boss colide com o player
    {
        Actor tiroInimigo1 = getOneIntersectingObject(Tiro2.class);
        Actor tiroInimigo2 = getOneIntersectingObject(Tiro3.class);
        
        if (tiroInimigo1 != null || tiroInimigo2 != null)
        {
            getWorld().removeObject(tiroInimigo1);
            getWorld().removeObject(tiroInimigo2);
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            Life life = myWorld.getContador();
            life.removeLife();
        }
    }
    
    public void bulletHit()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        
        if (bullet != null)
        {
            getWorld().removeObject(bullet);
            World world = getWorld();
            WorldGame myWorld = (WorldGame)world;
            myWorld.gotBullet = true;
        }
    }
 }
