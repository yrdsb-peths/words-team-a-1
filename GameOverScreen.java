import greenfoot.*;
import java.util.HashMap;

public class GameOverScreen extends World {
    Label gameOverLabel = new Label("Game Over", 70);
    Label highscoresLabel = new Label("Recent Scores:", 40);
    Label scoreLabel1;
    Label scoreLabel2;
    Label scoreLabel3;
    Label scoreLabel4;
    Label scoreLabel5;
    
    public GameOverScreen() {
        super(600, 400, 1);
        
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
            scoreLabel1 = new Label(score1.toString(), 30);
            scoreLabel2= new Label (score2.toString(), 30);
            addObject(scoreLabel1, 295, 175);
            addObject(scoreLabel2, 295, 200);
        }
    }
}
