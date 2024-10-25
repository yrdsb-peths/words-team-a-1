import greenfoot.*;
import java.util.*;

public class Letters extends Actor
{
    Map<String,String> letters;
    
    public Letters()
    {
        //put all letters into hashmap
        letters = new HashMap<>();
        letters.put("a", "a.png");
        letters.put("b", "b.png");
        letters.put("c", "c.png");
        letters.put("d", "d.png");
        letters.put("e", "e.png");
        letters.put("f","f.png");
        letters.put("g", "g.png");
        letters.put("h", "png");

    }

    public void act()
    {
        //switch colours depending on keys typed (access word 2D array and switch image)
    }

}


