import greenfoot.*;

public class GameOverScreen extends World {
    Label gameOverLabel = new Label("Game Over", 60);
    Label highscoresLabel = new Label("High Scores", 40);
    Label scoreLabel1 = new Label(Scores.returnScoreValue(1), 30);
    // Label scoreLabel2 = new Label("Game Over", 30);
    // Label scoreLabel3 = new Label("Game Over", 30);


    // Labek score
 
    public GameOverScreen() {
        super(600, 400, 1); 
        addObject(gameOverLabel, 250, 100);
        addObject(highscoresLabel, 250, 150);
        System.out.println(Scores.returnScoreValue(1));
        // addObject(titleLabel, 250, 100);
        // addObject(titleLabel, 250, 100);
        // addObject(titleLabel, 250, 100);
        // addObject(titleLabel, 250, 100);
        // addObject(titleLabel, 250, 100);
        // addObject(titleLabel, 250, 100);
    }

    // Add the game screen when done
    // public void act() {
    //     if(Greenfoot.isKeyDown("space")) {
    //         Greenfoot.setWorld(menuScreen);
    //     }
    // }
}
