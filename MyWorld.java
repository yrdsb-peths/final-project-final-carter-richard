import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    
    public MyWorld() {
        super(850, 478, 1);
        
        FlappyBoy flappy = new FlappyBoy();

        addObject(flappy, 300, 300);

        addObject(flappy, 175, 300);

    
    }
    
    public void act()
    {
        counter++;
        if(counter == 100) 
        {
            Pipe pipes = new Pipe();
            addObject(pipes, getWidth(), getHeight()/2);
            System.out.println(counter);
            counter = 0;
        }
    }
}
