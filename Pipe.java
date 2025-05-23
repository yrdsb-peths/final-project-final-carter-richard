import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    int pipeSpeed = -4;
    public void act()
    {
        setLocation(getX() + pipeSpeed, getY() );
    }
}
