import greenfoot.*;
import java.util.HashMap;

public class GameOverScreen extends World {
    GFLabel gameOverLabel = new GFLabel("Game Over", 90);
    GFLabel highscoresLabel = new GFLabel("Recent Scores: ", 35);
    GFLabel instructionsLabel = new GFLabel("Press [SPACE] to play again", 40);
    
    GFLabel scoreLabel1;
    GFLabel scoreLabel2;
    GFLabel scoreLabel3;
    GFLabel scoreLabel4;
    GFLabel scoreLabel5;
    GFLabel scoreLabel6;
    
    public GameOverScreen() {
        super(600, 400, 1);
        setBackground(new GreenfootImage("7481714.png"));
        
        addObject(gameOverLabel, 295, 75);
        addObject(highscoresLabel, 295, 195);
        addObject(instructionsLabel, 300, 360);
        

        Integer score1 = Scores.returnScoreValue(1);
        Integer score2 = Scores.returnScoreValue(2);
        Integer score3 = Scores.returnScoreValue(3);
        Integer score4 = Scores.returnScoreValue(4);
        Integer score5 = Scores.returnScoreValue(5);
        Integer score6 = Scores.returnScoreValue(6);
        
        // displayed each score, if appliciable
        
        if(score1!=null){
            scoreLabel1 = new GFLabel("Your Score: " + score1.toString(), 50);
            addObject(scoreLabel1, 295, 145);
        }
        if(score2!=null){
            scoreLabel2= new GFLabel (score2.toString(), 30);
            addObject(scoreLabel2, 295, 225); 
        }
        if(score3!=null){
            scoreLabel3= new GFLabel (score3.toString(), 30);
            addObject(scoreLabel3, 295, 250);
        }
        if(score4!=null){
            scoreLabel4 = new GFLabel(score4.toString(), 30);
            addObject(scoreLabel4, 295, 275);
        }
        if(score5!=null){
            scoreLabel5= new GFLabel (score5.toString(), 30);
            addObject(scoreLabel5, 295, 300);
        }
        if(score6!=null){
            scoreLabel6= new GFLabel(score6.toString(), 30);
            addObject(scoreLabel6, 295, 325);
        }
    }
    
    // Add the game screen when done
    public void act() {
         if(Greenfoot.isKeyDown("space")) {
            MyGame.score=0;
            Greenfoot.setWorld(new MyGame());
        }
    }
}
