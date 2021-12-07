import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição de que a classe MainWindow é filha da classe Wold, herdando suas caracteristicas e sendo a primeira classe que é instanciada dentro do jogo.
 */
public class MainWindow extends World
{
    /**
     * Construtor da classe MainWindow e que parametriza o Super com seus respectivos valores e o prepare sem nenhum parametro, uma vez que tudo é definido dentro do método
     */
    public MainWindow()
    {    
        super(700, 500, 1);
        prepare();
    }
    /**
     * Metodo que verifica o pressionamento do Enter a fim de iniciar o jogo
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
      /**
     * Metodo que inicializa os metodos com seus respectivos parametros no inicio da fase, e que é chamada pelo metodo construtor da classe
     */
    public void prepare()
    {

        Msg msg = new Msg();
        addObject(msg, 91,510);
        msg.setLocation(350,450);
        msg.setLocation(346,258);
        msg.setLocation(372,440);
        msg.setLocation(496,229);
    }
}
