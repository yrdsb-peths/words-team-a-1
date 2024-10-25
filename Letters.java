import greenfoot.*;
import java.util.*;

public class Letters extends Actor
{
    public static Map<String,String> letter;
    
    public Letters()
    {
        letter= new HashMap<>();

        //put all letters into hashmap
        letter.put("a", "00_grey letters.png ");
        letter.put("b", "01_grey letters.png ");
        letter.put("c", "02_grey letters.png ");
        letter.put("d", "03_grey letters.png ");
        letter.put("e", "04_grey letters.png ");
        letter.put("f", "05_grey letters.png ");
        letter.put("g", "06_grey letters.png ");
        letter.put("h", "07_grey letters.png ");
        letter.put("i", "08_grey letters.png ");
        letter.put("j", "09_grey letters.png ");
        letter.put("k", "10_grey letters.png ");
        letter.put("l", "11_grey letters.png ");
        letter.put("m", "12_grey letters.png ");
        letter.put("n", "13_grey letters.png ");
        letter.put("o", "14_grey letters.png ");
        letter.put("p", "15_grey letters.png ");
        letter.put("q", "16_grey letters.png ");
        letter.put("r", "17_grey letters.png ");
        letter.put("s", "18_grey letters.png ");
        letter.put("t", "19_grey letters.png ");
        letter.put("u", "20_grey letters.png ");
        letter.put("v", "21_grey letters.png ");
        letter.put("w", "22_grey letters.png ");
        letter.put("x", "23_grey letters.png ");
        letter.put("y", "24_grey letters.png ");
        letter.put("z", "25_grey letters.png ");
    }

    public void act()
    {
        //switch colours depending on keys typed (access word 2D array and switch image)
    }

}


