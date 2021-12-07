import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a muniçao que o jogador pode pegar para aumentar a quantida de disparos por vez
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Bullet extends Bots
{
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        move(-1);
        removeFromWorld();   
    }
    
    /**
     * Metodo responsavel por remover a muniçao ao chegar no fim da tela
     */
    public void removeFromWorld() // Elimina ao colidir com uma parede
    {       
        if(getX() < 10) {
            getWorld().removeObject(this);
        }
    }
}
