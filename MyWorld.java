import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(850, 478, 1);
        
        FlappyBoy flappy = new FlappyBoy();
        addObject(flappy, 300, 300);
    }
}
