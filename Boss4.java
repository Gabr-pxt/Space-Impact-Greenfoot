import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boss4 extends Bots
{
    int hits = 0;
    int upOrDown;
    
    public Boss4(int upOrDown)
    {
        this.upOrDown = upOrDown;
    }
    
    
    // Metodo update do objeto
    public void act()
    {
        moveBoss(upOrDown);
        autoFire();
        alvoAcertado();
    }
    
    
    // Sistema de tiro do jogo
    public void autoFire() 
    {
        World w = getWorld();
        
        if (getY()%80 == 0)
        {
            w.addObject(new Tiro3(), getX() -120, getY() + 15); // cria um novo objeto Tiro3 dentro da cena
        }
    }
    
    
    // Verificação das colisões dentro da cena 
    public void alvoAcertado()
    {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        Actor nave = getOneIntersectingObject(Nave.class);
        
        if (nave != null) // Verifica se a colisão é com uma nave
        {                     
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Life life = myWorld.getContador();
             life.removeLife();
        }
        else if (tiro != null) // verifica se um tiro disparado pela nave entrou em contato
        {
             getWorld().removeObject(tiro);             
             World world = getWorld();
             WorldGame myWorld = (WorldGame)world;
             Counter counter = myWorld.getCounter();
             
             hits++;
             
             if (hits >= 50) //Verifica o limite máximo da vida do Boss
             {
                 MyWorld4 myWorld4 = (MyWorld4)myWorld;
                 myWorld4.bossIsDead = true;
                 getWorld().removeObject(this);
                 counter.addBossScore();
             }
        }
        else if(getY() <= 120) //Altera a movimentação do Boss
        {
            
            upOrDown = 1;
            
        }
        else if(getY() >= 400) //Altera a movimentação do Boss
        {
            
            upOrDown = 0;
        }
    }
}
