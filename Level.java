import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level extends Actor
{
    int index = 1;
    Color color;
    
    public Level(Color color)
    { // Criação da mensagem informatica
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        this.color = color;
    }
    
    public Level(int index, Color color)
    { // Preenchimento do index dentro da imgem com fonte colorida
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        this.index = index;
        this.color = color;
    }
    
    public void act() //Atualização do conteudo da imagem
    {
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        
    }
}
