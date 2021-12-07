import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa uma mensagem na tela do jogo
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Msg extends Actor
{
    /**
     * Atributo que representa a mensagem (valor em String)
     */
    String msg;
    
    /**
     * Atributo que representa o tamanho da fonte da mensagem
     */
    int fontSize;
    
    /**
     * Metodo construtor
     */
    public Msg (){ 
        msg = "PRESS ENTER";
        fontSize = 35;
    }
    
    /**
     * Sobrecarga do metodo construtor que recebe 2 paramentos
     * 
     * @param valor da mensagem que ira aparecer na tela
     * @param tamanho da fonte da mensagem
     */
    public Msg (String msg, int fontSize){
        this.msg = msg;
        this.fontSize = fontSize;
    }
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        setImage(new GreenfootImage (msg, fontSize, null, null));
    }
}
