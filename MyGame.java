import greenfoot.*;

public class MyGame extends World {
    public MyGame() {
        super(600, 400, 1); 
        setBackground(new GreenfootImage("7481714.png"));
        Greenfoot.setWorld(new MenuScreen());
        
        Avatar avatar = new Avatar();
        addObject(avatar, 100, 300);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 550, 300);
    }

    public static void main(String[] args) {
        new MyGame(); 
    }
    
    public boolean isRunning = true;
    
    public boolean isRunning() {
        return isRunning; 
    }
    
    public void gameOver() {
        Label gameOver = new Label("Game Over!", 70);
        addObject(gameOver, 300, 200);
        isRunning = false; 
    }
}
