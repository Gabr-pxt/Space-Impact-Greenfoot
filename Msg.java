import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Msg extends Actor
{
    String msg;
    int fontSize;
    
    
    // Criação da mensagem na cena
    public Msg (){ 
        msg = "PRESS ENTER";
        fontSize = 35;
    }
    
    public Msg (String msg, int fontSize){
        this.msg = msg;
        this.fontSize = fontSize;
    }
    
    public void act()
    {
        setImage(new GreenfootImage (msg, fontSize, null, null));
        
    }
}
