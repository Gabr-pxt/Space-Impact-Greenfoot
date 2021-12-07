import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o valor da fase que esta sendo jogada
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Level extends Actor
{
    /**
     * Atributo que representa a quantidade de pontos do jogador
     */
    int index = 1;
    
    Color color;
    
    /**
     * Metodo construtor
     */
    public Level(Color color)
    { // Criação da mensagem informatica
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        this.color = color;
    }
    
    /**
     * Sobrecarga do metodo construtor recebendo um paramentro
     * 
     * @param indice que representa o numero da fase
     */
    public Level(int index, Color color)
    { // Preenchimento do index dentro da imgem
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        this.index = index;
        this.color = color;
    }
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act() //Atualização do conteudo da imagem
    {
        setImage(new GreenfootImage ("LEVEL: " + index, 30, color, null));
        
    }
}
