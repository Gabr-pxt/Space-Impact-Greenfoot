import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Life extends Actor
{
    int contador = 5; // Numero max de vidas
    Color color;
    
    public Life(Color color)
    {
        setImage(new GreenfootImage (" " + contador, 30, color, null));
        this.color = color;
    }
    
    public void act()
    {
        setImage(new GreenfootImage (" " + contador, 30, color, null));
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
