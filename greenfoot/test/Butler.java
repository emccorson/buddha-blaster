import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butler extends Enemies
{
    //variables
    private int reloadCounter = Greenfoot.getRandomNumber(20);
    private int reloadRate = 30;

    /**
     * Act - do whatever the Butler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+1);
        
        fire();
        die();
    }   
    
    public void fire()
    {
        if (reloadCounter == reloadRate)
            {
                getWorld().addObject(new RedEnergy(), getX(), getY());
                reloadCounter = 0;
            }
        reloadCounter++;
    }
}