import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(850, 478, 1);
        
        FlappyBoy flappy = new FlappyBoy();
        addObject(flappy, 300, 300);
        
        Pipe pipe = new Pipe();
        addObject(pipe, 300, 300);
    
    }
}
