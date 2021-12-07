import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o valor das vidas do jogador
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Life extends Actor
{
    /**
     * Atributo que represeta a quantidade de vidas do jogador
     */
    int contador = 5;
    Color color;
    
    /**
     * Metodo Construtor
     */
    public Life(Color color)
    {
        setImage(new GreenfootImage (" " + contador, 30, color, null));
        this.color = color;
    }
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        setImage(new GreenfootImage (" " + contador, 30, color, null));
        youLose();
    }
    
    /**
     * Metodo responsavel por remover uma vida do jogador
     */
    public void removeLife()
    {
        if(contador > 0) 
        {
          contador = contador-1;  
        }
    }
    
    /**
     * Metodo responsavel por chamar a tela de "game over"
     */
    public void youLose()
    {
        if (contador == 0)
        {
            getWorld().addObject(new YouLose(),335,250);
            Greenfoot.stop();
        }
    }
}
