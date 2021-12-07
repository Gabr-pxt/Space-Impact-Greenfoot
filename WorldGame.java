import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * @author (Kaique, Joel, Gabriel e yago) 
 * @version (V.1.0.1)
 */

public class WorldGame extends World
{
    /**
     * Variaveis responsáveis função random e pela contagem de vidas
     */
    
    Color hudColor = Color.BLACK;
    Counter counter = new Counter(hudColor);
    Random rand = new Random();
    Life life = new Life(hudColor);
    
    /**
     * Atribui um valor falso nas variaveis booleanas, para serem atribuidas no metodo bossThere() e addBots4().
     */
    boolean dropBullet = false;
    boolean bossThere = false;
    boolean gotBullet = false;
    
    int upOrDown;
    int score = 0;
    /**
     * Metodo construtor da classe que recebe tres parametros
     */
    public WorldGame(int a, int b, int c)
    {    
        super(a, b, c); 
    }
     
    /**
     * Get para contador de pontuação do Game
     */ 
    public Counter getCounter()
    {
        return counter;
    }
    
    
    /**
     * Get para verificar quantidade de vidas do player
     */
    public Life getContador()
    {
        return life;
    } 
    
    /**
     * Bots que entrarão na fase 001
     */ 
    public void addBots() 
    {
        int position = (int) (Math.random() * (400 - 65)) + 100;
        addObject(new Bots1(), 650, position);       

    } 
    
    /**
     * Bots que entrarão na fase 002
     */
    public void addBots2() 
    {
        if (!bossThere){
             /**
             * Estrutura condicional que verifica se a variável bossThere é diferente de true
             */
            int position = (int) (Math.random() * (400 - 65)) + 100;
            addObject(new Bots2(), 650, position);  
        }
        if (counter.score >= 600 && !bossThere){
             /**
             * Estrutura condicional que verifica a pontuação e a bossThere
             */
            upOrDown = rand.nextInt(2);
            addObject(new Boss1(upOrDown), 650, 250);
            bossThere = true;
        }
    }
    
    /**
     * Bots que entrarão na fase 003
     */
    public void addBots3(){
        int position = (int) (Math.random() * (400 - 65)) + 100;
        addObject(new Bots3(), 650, position);
    }
    
    /**
     * Bots que entrarao na fase 004
     */
    public void addBots4()
    {
        
        if (counter.score < 1500){
            /**
             * Estrutura condicional que verifica a quantidade de pontos para que a classe seja instanciada e assim, os objetos Bots4 sejam apresentados
             */
            int position = (int) (Math.random() * (400 - 65)) + 100;
            addObject(new Bots4(), 650, position);  
        }
        
        if (counter.score >= 1000 && !dropBullet){
            /**
             * Estrutura condicional que verifica a quantidade de pontos para que alem dos objetos anteriores, o objeto Bullet seja instanciado
             */
            int position = (int) (Math.random() * (400 - 65)) + 100;
            addObject(new Bullet(), 650, position);
            dropBullet = true;
        }
        
        if (counter.score >= 1400 && !bossThere)
        {
            /**
             * Estrutura condicional que verifica a quantidade de pontos para que alem dos objetos anteriores, por ultimo, o Boss4 é instanciado
             */
            upOrDown = rand.nextInt(2);
            addObject(new Boss4(upOrDown), 600, 250);
            bossThere = true;
        }
    }    
    
    /**
     * Método padrão do jogo
     */
    public void prepare()
    {        
        Nave nave = new Nave();
        addObject(nave,81,213);
        nave.setLocation(109,219);
        addObject(counter,71,472);
        counter.setLocation(356,25);    
        addObject(life,65,36);
        Coracao coracao = new Coracao();
        addObject(coracao,32,30);
        coracao.setLocation(31,20);
        life.setLocation(69,24);
        counter.setLocation(174,24);
    }
}
