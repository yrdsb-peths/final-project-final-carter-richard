import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    private int score = 0;

    public MyWorld() {
        super(850, 478, 1);

        FlappyBoy flappy = new FlappyBoy();
        addObject(flappy, 175, 300);
        

        showScore(); // Show initial score
    }

    public void act() {
        counter++;
        if(counter == 100) {
            Pipe pipes = new Pipe();

            GreenfootImage image = pipes.getImage();
            addObject(pipes,getWidth(), getHeight()/2 + image.getHeight());

            addObject(pipes, getWidth(), getHeight()/2);

            counter = 0;
        }
    }

    public void increaseScore() {
        score++;
        showScore();
    }

    private void showScore() {
        showText("Score: " + score, 100, 30);
    }
}

