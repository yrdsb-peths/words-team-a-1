import greenfoot.*;

public class MyGame extends World {
    public MyGame() {
        super(600, 400, 1); 
        setBackground(new GreenfootImage("7481714.png"));
        Greenfoot.setWorld(new MenuScreen());
    }

    public static void main(String[] args) {
        new MyGame(); 
    }
}
