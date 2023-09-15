import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuddhaDa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuddhaDa extends Enemies
{
    //variables
    private int reloadCounter = 0;
    private int reloadRate = 13;
    
    /**
     * Act - do whatever the BuddhaDa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        fire();
        die(15);
    }
    
    public void move()
    {
        
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
