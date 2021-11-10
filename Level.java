import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level extends Actor
{
    int index = 1;
    
    public Level(){ // Criação da mensagem informatica
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
    }
    
    public Level(int index){ // Preenchimento do index dentro da imgem
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
        this.index = index;
    }
    
    public void act() //Atualização do conteudo da imagem
    {
        setImage(new GreenfootImage ("LEVEL: " + index, 30, null, null));
        
    }
}
