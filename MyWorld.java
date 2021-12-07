import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Definição de que a classe MyWorld é filha da classe WoldGame, herdando suas caracteristicas.
 */
public class MyWorld extends WorldGame
{
    Level level = new Level(super.hudColor);
    /**
     * Metodo contrutor que invoca o super, metodo prepare (metodo responsavel pelas configurações iniciais da fase) e o Greenfoot.setSpeed (que define a velocidade reprodução da cena)
     */
    public MyWorld()
    {    
        super(700, 500, 1); 
        prepare();
        Greenfoot.setSpeed(48);
    }
        
     
    /**
     * Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots();
        }
        
        if (counter.score >= 300)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,2));
        }
    }
    /**
     * Metodo que inicializa os metodos com seus respectivos parametros no inicio da fase, e que é chamada pelo metodo construtor da classe
     */   
    public void prepare()
    {
        super.prepare();
        addObject(level, 91,510);
        level.setLocation(570,25);
        Montanhas montanhas = new Montanhas();
        addObject(montanhas,358,473);
        level.setLocation(615,14);
        counter.setLocation(352,20);        
        life.setLocation(62,22);
        counter.setLocation(333,16);
    }
}
