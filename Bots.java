import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bots extends Actor
{
    public void act()
    {
        
    }        
    
    //movimentação dos bots
    public void moveBots()
    {        
        setLocation(getX()-5, getY());
    }
    
    //movimentação dos bots a partir da fase 003
    public void moveBots3()
    {        
        setLocation(getX()-3, getY());
    }
    
    
    //movimentação dos bots que aparecerá na fase 002 contendo moviemntação alternada
    public void moveBoss(int upOrDown) // recebe o parametro da direção da moviemntação do boss
    {
        if (upOrDown == 0)
        {
            setLocation(getX(), getY()-2);
        }
        else
        {
            setLocation(getX(), getY()+2);
        }
    }
    
    // remove os bots ao colidir com a parede do jogo
    public void removeBots()
    {         
        if(getX() == 0) //Captura a posição do eixo X
        {
            getWorld().removeObject(this); //remove o objeto atual da cena
        }
    }
}
