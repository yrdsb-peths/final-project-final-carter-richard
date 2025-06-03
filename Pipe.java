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
    private boolean passed = false;
    
    public Pipe(boolean isTop)
    {
        setImage("Pipe.jpg");
       if(isTop) 
       {
           GreenfootImage image = getImage();
           image.mirrorVertically();
           setImage(image);
       }
    }

    public void act()
    {
        setLocation(getX() + pipeSpeed, getY());
        
        FlappyBoy flappy = null;
        if(getWorld() != null && !getWorld().getObjects(FlappyBoy.class).isEmpty())
        {
            flappy = (FlappyBoy) getWorld().getObjects(FlappyBoy.class).get(0);
        }
        if (flappy != null && !passed && getX() + getImage().getWidth() / 2 < flappy.getX()) {
            passed = true;
            ((MyWorld) getWorld()).increaseScore();
        }

        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}

