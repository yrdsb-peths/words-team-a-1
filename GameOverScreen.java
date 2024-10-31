import greenfoot.*;
import java.util.HashMap;

public class GameOverScreen extends World {
    Label gameOverLabel = new Label("Game Over", 70);
    Label highscoresLabel = new Label("Recent Scores:", 40);
    Label scoreLabel1;
    Label scoreLabel2;

    public GameOverScreen() {
        super(600, 400, 1);
        
        addObject(gameOverLabel, 295, 75);
        addObject(highscoresLabel, 295, 150);

        Scores.addScore(1400);
        Scores.addScore(1500);

        Integer score1 = Scores.returnScoreValue(1);
        Integer score2 = Scores.returnScoreValue(2);
        if (score1 != null) {
            scoreLabel1 = new Label(score1.toString(), 30);
            scoreLabel2= new Label (score2.toString(), 30);
            addObject(scoreLabel1, 295, 175);
            addObject(scoreLabel2, 295, 200);
        }
    }
}
