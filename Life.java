import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Life extends Actor
{
    int contador = 5; // Numero max de vidas
    
    public Life()
    {
        setImage(new GreenfootImage (" " + contador, 30, null, null));
    }
    
    public void act()
    {
        setImage(new GreenfootImage (" " + contador, 30, null, null));
        youLose();
    }
    
    public void removeLife() // Remove as vidas contidas dentro do contador
    {
        if(contador > 0) 
        {
          contador = contador-1;  
        }
    }
    
    public void youLose() // Chamada da menssagem de game over
    {
        if (contador == 0)
        {
            getWorld().addObject(new YouLose(),335,250);
            Greenfoot.stop();
        }
    }
}
