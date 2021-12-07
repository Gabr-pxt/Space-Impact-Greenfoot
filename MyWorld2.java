import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Definição de que a classe MyWorld2 é filha da classe WoldGame, herdando suas caracteristicas.
 */
public class MyWorld2 extends WorldGame
{
    /**
     * Instancia um novo objeto Level
     */
    Level level = new Level(2, hudColor);
    /**
     * Atribui a variavel booleana bossIsDead para falso para que seja invertida caso o jogador consiga derrotar o Boss
     */
    boolean bossIsDead = false;    
    int actualScore;
    
     /**
     * Metodo contrutor que invoca o super, metodo prepare (metodo responsavel pelas configurações iniciais da fase), o Greenfoot.setSpeed (que define a velocidade reprodução da cena) e 
     * faz o incremento da variavel score atravez do actualScore rcebido como parametro.
     */
    public MyWorld2(int actualScore)
    {    
        super(700, 500, 1);
        prepare();
        Greenfoot.setSpeed(50);
        counter.score = actualScore;
    }
   
    /**
     * Metodo update da cena, realiza chamada dos bots e faz a verificação de levelUP
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addBots2();
        }
        
        if (counter.score >= 600 && bossIsDead)
        {
            Greenfoot.setWorld(new PhaseDone(counter.score,3));
        }
    }
     /**
     * Metodo que inicializa os metodos com seus respectivos parametros no inicio da fase, e que é chamada pelo metodo construtor da classe
     */
    public void prepare()
    {        
        super.prepare();
        addObject(level, 91,510);
        life.setLocation(51,19); 
        level.setLocation(629,12);
        counter.setLocation(337,481);
    }
}
