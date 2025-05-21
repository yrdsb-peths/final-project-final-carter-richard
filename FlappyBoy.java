import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBoy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBoy extends Actor
{
    /**
     * Act - do whatever the FlappyBoy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("down"));
        {
            move(1);
        }

    }
}
