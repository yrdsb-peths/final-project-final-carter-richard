import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBoy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBoy extends Actor
{
    private int velocity = 0;
    private final int gravity = 1;
    private final int flapStrength = -10;

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            velocity = flapStrength;
        }

        velocity += gravity;
        setLocation(getX(), getY() + velocity);

        if (getY() >= getWorld().getHeight() - 1)
        {
            setLocation(getX(), getWorld().getHeight() - 1);
            gameOver();
        }

        if (isTouching(Pipe.class))
        {
            gameOver();
        }
    }

    private void gameOver()
    {
        getWorld().showText("Game Over", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        Greenfoot.stop();
    }
}



