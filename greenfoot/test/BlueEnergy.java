import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueEnergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueEnergy extends Actor
{
    /**
     * Act - do whatever the BlueEnergy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 10);
        checkOnScreen();
    }    
    
    public void checkOnScreen()
    {
        if (getY() <= 1)
        {
            getWorld().removeObject(this);
        }
    }
}
