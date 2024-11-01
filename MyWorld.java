import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        setBackground( new GreenfootImage("7481714.jpg.png"));
        
        Avatar hero = new Avatar(); 
        addObject(hero, 300, 200);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 400, 200);
    }
}
