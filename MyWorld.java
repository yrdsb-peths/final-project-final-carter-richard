import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    private int score = 0;
    private final int GAP = 500;

    public MyWorld() {
        super(850, 478, 1);

        FlappyBoy flappy = new FlappyBoy();
        addObject(flappy, 175, 300);
        

        showScore(); // Show initial score
    }

    public void act() {
        counter++;
        if(counter == 100) {
            createPipePair();

            counter = 0;
        }
    }
    private void createPipePair()
    {
        int pipeHeight = Greenfoot.getRandomNumber(150) + 300;
        int pipeWidth = new Pipe(false).getImage().getWidth();
        
        Pipe bottomPipe = new Pipe(false);
        addObject(bottomPipe, getWidth() + pipeWidth / 2, pipeHeight);
        
        Pipe topPipe = new Pipe(true);
        int topY = pipeHeight - GAP - topPipe.getImage().getHeight();
        addObject(topPipe, getWidth() + pipeWidth / 2, topY);
        
    }
    public void increaseScore() {
        score++;
        showScore();
    }

    private void showScore() {
        showText("Score: " + score, 100, 30);
    }
}

