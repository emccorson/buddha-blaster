import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    private int dieValue;

    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //FUCKING FUCKS SAKE WHAT THE FUCKING FUCK.
        //FIX THIS.
        die( int dieValue );
    }    
    
    public void die( int dieValue )
    {
        Actor blueEnergy;
        blueEnergy = getOneObjectAtOffset(0,0,BlueEnergy.class);
        if (blueEnergy != null)
        {
            getWorld().removeObject(blueEnergy);
            getWorld().removeObject(this);
            Spawner.score = Spawner.score + dieValue;
        }
    }
}
