import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa todos os objetos que interagem com o jogador (classe Nave)
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */


public class Bots extends Actor
{
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos)
     */
    
    public void act()
    {
        
    }        
    
    /**
     * Metodo responsavel por movimentar os objetos na tela
     */
    
    public void moveBots()
    {        
        setLocation(getX()-5, getY());
    }
    
    /**
     * Metodo resposavel pela movimentaçao dos objetos a partir da fase 03
     */
    public void moveBots3()
    {        
        setLocation(getX()-3, getY());
    }
    
    /**
     * Metodo responsavel pela movimentação do boss que aparecerá na fase 002 contendo moviemntação alternada
     * 
     * @param upOrDows um valor que representa a direçao que o objeto deve seguir na tela
     */
    public void moveBoss(int upOrDown)
    {
        if (upOrDown == 0)
        {
            setLocation(getX(), getY()-2);  //move o objeto em 2 unidades para "cima"
        }
        else
        {
            setLocation(getX(), getY()+2);  //move o objeto em 2 unidades para "baixo"
        }
    }
    
    /**
     * Metodo responsavel por remover o objeto da tela ao colidir com a "parede" (lateral da tela)
     */
    public void removeBots()
    {         
        if(getX() == 0) //Captura a posição do eixo X
        {
            getWorld().removeObject(this); //remove o objeto atual da cena
        }
    }
}
