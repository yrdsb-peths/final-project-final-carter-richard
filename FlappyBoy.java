import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBoy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBoy extends Actor
{
    private int velocity = 0;         // Vertical speed
    private final int gravity = 1;    // Gravity pulls down
    private final int flapStrength = -10; // Upward force on flap

    public void act()
    {
        // Flap up when space is pressed
        if (Greenfoot.isKeyDown("space"))
        {
            velocity = flapStrength;
        }
        velocity += gravity;

        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 1)
        {
            setLocation(getX(), getWorld().getHeight() - 1);
            velocity = 0;
        }
    }
}


