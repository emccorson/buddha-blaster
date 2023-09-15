import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedEnergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedEnergy extends Actor
{
    /**
     * Act - do whatever the RedEnergy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 5);
        checkOnScreen();
    }    
    
    public void checkOnScreen()
    {
        if (getY() >= getWorld().getHeight() - 1)
        {
            getWorld().removeObject(this);
        }
    }
}
