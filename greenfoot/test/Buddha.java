import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buddha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buddha extends Actor
{
    //variables
    private int reloadCounter = 5;

    /**
     * Act - do whatever the Buddha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyboardControls();
        //die();
    }    
    
    public void keyboardControls()
    {       
        //Movement
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        
        //Firing energy
        if (Greenfoot.isKeyDown("space"))
        {
            if (reloadCounter == 5) 
            {
                getWorld().addObject(new BlueEnergy(), getX(), getY());
                reloadCounter = 0;
            }
            reloadCounter++;
        }
    }
    
    public void die()
    {        
            if (getOneObjectAtOffset(0, 0, Butler.class) != null)
            {
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            
            Actor redEnergy;
            redEnergy = getOneObjectAtOffset(0,0,RedEnergy.class);
            if (redEnergy != null)
            {
                getWorld().removeObject(redEnergy);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
    }
}