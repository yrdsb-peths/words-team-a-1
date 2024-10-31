import greenfoot.*;
import java.util.*;

public class Letters extends Actor
{
    public Map<String,String> letter;
    public String lett;
    public GreenfootImage image;
    public World world;

    public Letters(String lett, World world)
    {
        //set up map
        letter= new HashMap<>();
        fillMap();

        this.lett = lett;
        this.world = world;
        //set up image for letter
        changeImage();
    }

    public void act(){}
    
    /**
     * 
     * @param key
     */
    public void removeImage(String key)
    {
        letter.replace(key, "null");
        changeImage();
    }

    /**
     * This method changes the value of the letter hashmap to the red version of the letters
     * @param key
     */
    public void toRed(String key)
    {
        if(letter.get(key).contains("grey"))
        {
            //create string containing address of red version of letter
            String newImage = "images/red letters/";
            newImage = newImage.concat(letter.get(key).substring(20,23) + "red letters.png");

            //replace value at key with new red version of letter
            letter.replace(key, newImage);

            //set up image for letter
            changeImage();
        }
    }

    /**
     * This method changes the value of the letter hashmap to the grey version of the letters
     * @param key
     */
    public void toGrey(String key)
    {
        //only changes colour if value is already red
        if(letter.get(key).contains("red"))
        {
            String newImage = "images/grey letters/";
            newImage = newImage.concat(letter.get(key).substring(19,22) + "grey letters.png");

            letter.replace(key,newImage);
            changeImage();
        }
    }
    
    /**
     * This method creates a new greenfoot image and sets it to the image of class
     */
    private void changeImage()
    {
        //world.removeObject(this);
        if(letter.get(lett).equals("null"))
        {
            setImage((GreenfootImage)null);
        }
        else
        {
            image = new GreenfootImage(letter.get(lett));
            image.scale(30,30);
            setImage(image);
        }
    }

    /**
     * This method fills the hashmap with all the letters
     */
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


