import greenfoot.*;
import java.util.HashMap;

public class GameOverScreen extends World {
    GFLabel gameOverLabel = new GFLabel("Game Over", 70);
    GFLabel highscoresLabel = new GFLabel("Recent Scores:", 40);
    GFLabel scoreLabel1;
    GFLabel scoreLabel2;
    GFLabel scoreLabel3;
    GFLabel scoreLabel4;
    GFLabel scoreLabel5;
    
    public GameOverScreen() {
        super(600, 400, 1);
        setBackground(new GreenfootImage("7481714.png"));
        
        addObject(gameOverLabel, 295, 75);
        addObject(highscoresLabel, 295, 150);
        
        // Use these when adding  score upon death in the main game loop
        Scores.addScore(1400);
        Scores.addScore(1500);

        Integer score1 = Scores.returnScoreValue(1);
        Integer score2 = Scores.returnScoreValue(2);
        Integer score3 = Scores.returnScoreValue(3);
        Integer score4 = Scores.returnScoreValue(4);
        Integer score5 = Scores.returnScoreValue(5);
        
        
        if (score1 != null) {
            scoreLabel1 = new GFLabel(score1.toString(), 30);
            scoreLabel2= new GFLabel (score2.toString(), 30);
            addObject(scoreLabel1, 295, 175);
            addObject(scoreLabel2, 295, 200);
        }
    }
    
    // Add the game screen when done
    // public void act() {
    //     if(Greenfoot.isKeyDown("space")) {
    //         Greenfoot.setWorld(menuScreen);
    //     }
    // }
}
