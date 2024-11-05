import java.io.IOException;
import greenfoot.*;

public class MyGame extends World {
    
    public boolean isRunning = true;
    public int score = 0;

    public MyGame() {
        super(600, 400, 1); 
        setBackground(new GreenfootImage("7481714.png"));
        Greenfoot.setWorld(new MenuScreen());
        
        Avatar avatar = new Avatar();
        addObject(avatar, 100, 300);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 550, 300);
        
        addWord();
    }

    public static void main(String[] args) {
        new MyGame(); 
    }
        
    public boolean isRunning() {
        return isRunning; 
    }
    
    public void gameOver() {
        Label gameOver = new Label("Game Over!", 70);
        addObject(gameOver, 300, 200);
        isRunning = false; 
    }

    public void addWord()
    {
        Word word;
        try {
            word = new Word(this);
            addObject(word, 0, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
