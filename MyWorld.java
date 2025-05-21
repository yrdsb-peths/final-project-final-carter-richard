import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        FlappyBoy flappy = new FlappyBoy();
        addObject(flappy, 300, 300);
    }
}
