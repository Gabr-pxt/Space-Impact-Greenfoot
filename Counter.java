import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o contador de pontos do jogo
 * 
 * @author Gabriel Peixoto, Kaique Nascimento, Joel Vasconcelos e Yago Santos
 * @since 06/12/2021
 * 
 */
public class Counter extends Actor
{
    /**
     * Atributo que representa a quantidade de pontos do jogador
     */
    int score = 0;
    
    Color color;
    
    /**
     * Metodo construtor
     */
    public Counter(Color color) // geração do Score inicial do jogo
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, color, null));
        this.color = color;
    }
    
    /**
     * Metodo que representa a açao que o objeto tera em cena (onde devem ser colocadas as chamadas de metodos), atualiza o score
     */
    public void act()
    {
        setImage(new GreenfootImage ("     SCORE: " + score, 30, color, null));
    }
    
    /**
     * Metodo responsavel por aumentar o Score apos eliminação de um bot padrao
     */
    public void addScore()
    {
        score += 10;
    }
    
    /**
     * Metodo responsavel por aumentar o Score apos eliminação de um boss
     */
    public void addBossScore()
    {
        score += 50;
    }
}
