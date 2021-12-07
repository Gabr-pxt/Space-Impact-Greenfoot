import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Definição de que a classe MyWorld3 é filha da classe WoldGame, herdando suas caracteristicas.
 */
public class MyWorld3 extends WorldGame
{
    /**
     * Instancia um novo objeto Level
     */
    Level level = new Level(3, hudColor);
    
    int actualScore;   

    /**
     * Metodo contrutor que invoca o super, metodo prepare (metodo responsavel pelas configurações iniciais da fase), o Greenfoot.setSpeed (que define a velocidade reprodução da cena) e 
     * faz o incremento da variavel score atravez do actualScore rcebido como parametro.
     */
    public MyWorld3(int actualScore)
    {    
        super(700, 500, 1); 
        prepare();
        Greenfoot.setSpeed(50);
        actualScore = actualScore;
        counter.score = actualScore;
    }
    
    /**
     * Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots3();
        }
        
        if (counter.score == 1100)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,4));
        }
    }
    
     /**
     * Metodo que inicializa os metodos com seus respectivos parametros no inicio da fase, e que é chamada pelo metodo construtor da classe
     */
    public void prepare()
    {
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(615,14); 
        life.setLocation(62,22);
        counter.setLocation(333,16);
    }
}
