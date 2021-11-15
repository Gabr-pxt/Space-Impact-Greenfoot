import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PhaseDone extends World
{
    Msg msg = new Msg("LEVEL DONE!", 70);
    Msg msg2 = new Msg();
    
    int actualScore;
    int newPhase;
    
    public PhaseDone(int score, int phase)
    {   
        super(700, 500, 1);
        prepare();
        actualScore = score;
        newPhase = phase;
    }
    
    
    // Chamada de Cena, funcionará para todas as fases
    public void act()
    {
        int aux;
        
        if (Greenfoot.isKeyDown("Enter"))
        {
            if (newPhase == 0)
                aux = 0; //Greenfoot.setWorld(new GameSucess(actualScore));
            else if (newPhase == 2)
                Greenfoot.setWorld(new MyWorld2(actualScore));
            else if (newPhase == 3)
                Greenfoot.setWorld(new MyWorld3(actualScore));
            else if (newPhase == 4)
                Greenfoot.setWorld(new MyWorld4(actualScore));
        }
    }
    
    
    //Preparação da cena
    private void prepare()
    {
        addObject(msg, 91,510);
        addObject(msg2, 91,510);
        msg2.setLocation(327,448);
        msg.setLocation(333,361);
        Gif gif = new Gif();
        addObject(gif,325,150);
    }
}
