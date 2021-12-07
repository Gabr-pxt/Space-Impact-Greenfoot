import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Classe que representa um disparo feito pela nave do jogador
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Tiro extends Actor
{
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    public void act()
    {
        move(25);   // Movimentação do tiro criado a partir da nave
        removeFromWorld();   
    }
    
    /**
     * Metodo responsavel por remover um disparo apos chegar proximo do limite da tela
     */
    public void removeFromWorld()
    {       
        if(getX() > 690) {
            getWorld().removeObject(this);
        }
    }
}


