import greenfoot.*;
import java.io.*;

public class MyWorld extends World 
{
    public MyWorld() throws IOException
    {
        super(600, 400, 1);
        setBackground( new GreenfootImage("7481714.jpg.png"));
        
        Word word = new Word(this);
        addObject(word,0,0);
        
        Avatar hero = new Avatar(); 
        addObject(hero, 300, 200);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 400, 200);
    }
}
