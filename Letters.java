import greenfoot.*;
import java.util.*;

public class Letters extends Actor
{
    public static Map<String,String> letter;
    String lett, image;

    public Letters(String lett)
    {
        letter= new HashMap<String, String>();
        fillMap();

        this.lett = lett;
       // image = letter.get(lett);
        GreenfootImage image = new GreenfootImage(letter.get(lett));
        image.scale(30,30);
        setImage(image);

    }

    public void act()
    {
        //switch colours depending on keys typed (access word 2D array and switch image)
    }

    public String toString()
    {
        return lett + ": " + image;
    }
    
    public void fillMap()
    {
        //put all letters into hashmap
        letter.put("a", "images/grey letters/00_grey letters.png ");
        letter.put("b", "images/grey letters/01_grey letters.png ");
        letter.put("c", "images/grey letters/02_grey letters.png ");
        letter.put("d", "images/grey letters/03_grey letters.png ");
        letter.put("e", "images/grey letters/04_grey letters.png ");
        letter.put("f", "images/grey letters/05_grey letters.png ");
        letter.put("g", "images/grey letters/06_grey letters.png ");
        letter.put("h", "images/grey letters/07_grey letters.png ");
        letter.put("i", "images/grey letters/08_grey letters.png ");
        letter.put("j", "images/grey letters/09_grey letters.png ");
        letter.put("k", "images/grey letters/10_grey letters.png ");
        letter.put("l", "images/grey letters/11_grey letters.png ");
        letter.put("m", "images/grey letters/12_grey letters.png ");
        letter.put("n", "images/grey letters/13_grey letters.png ");
        letter.put("o", "images/grey letters/14_grey letters.png ");
        letter.put("p", "images/grey letters/15_grey letters.png ");
        letter.put("q", "images/grey letters/16_grey letters.png ");
        letter.put("r", "images/grey letters/17_grey letters.png ");
        letter.put("s", "images/grey letters/18_grey letters.png ");
        letter.put("t", "images/grey letters/19_grey letters.png ");
        letter.put("u", "images/grey letters/20_grey letters.png ");
        letter.put("v", "images/grey letters/21_grey letters.png ");
        letter.put("w", "images/grey letters/22_grey letters.png ");
        letter.put("x", "images/grey letters/23_grey letters.png ");
        letter.put("y", "images/grey letters/24_grey letters.png ");
        letter.put("z", "images/grey letters/25_grey letters.png ");
    }
}


