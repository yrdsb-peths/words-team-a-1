import greenfoot.*;
import java.util.*;

public class Letters extends Actor
{
    public World world;
    public Map<String,String> letter;
    public String lett;
    public GreenfootImage image;

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
    
    /**
     * This method changes the image to null
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
        if(letter.get(key).contains("black"))
        {
            //create string containing address of red version of letter
            String newImage = "images/red letters/";
            newImage = newImage.concat(letter.get(key).substring(21,24) + "red letters.png");

            //replace value at key with new red version of letter
            letter.replace(key, newImage);

            //set up image for letter
            changeImage();
        }
    }

    /**
     * This method changes the value of the letter hashmap to the black version of the letters
     * @param key
     */
    public void toBlack(String key)
    {
        //only changes colour if value is already red
        if(letter.get(key).contains("red"))
        {
            //create string with address of black versiou of letter
            String newImage = "images/black letters/";
            newImage = newImage.concat(letter.get(key).substring(19,22) + "black letters.png");

            //replace value in hashmap and update
            letter.replace(key,newImage);

            //set up image for letter
            changeImage();
        }
    }
    
    /**
     * This method creates a new greenfoot image and sets it to the image of class
     */
    private void changeImage()
    {
        if(letter.get(lett).equals("null"))
        {
            setImage((GreenfootImage)null);
        }
        else
        {
            image = new GreenfootImage(letter.get(lett));
            image.scale(50,50);
            setImage(image);
        }
    }

    /**
     * This method fills the hashmap with all the letters
     */
    public void fillMap()
    {
        //put all letters into hashmap
        letter.put("a", "images/black letters/00_black letters.png ");
        letter.put("b", "images/black letters/01_black letters.png ");
        letter.put("c", "images/black letters/02_black letters.png ");
        letter.put("d", "images/black letters/03_black letters.png ");
        letter.put("e", "images/black letters/04_black letters.png ");
        letter.put("f", "images/black letters/05_black letters.png ");
        letter.put("g", "images/black letters/06_black letters.png ");
        letter.put("h", "images/black letters/07_black letters.png ");
        letter.put("i", "images/black letters/08_black letters.png ");
        letter.put("j", "images/black letters/09_black letters.png ");
        letter.put("k", "images/black letters/10_black letters.png ");
        letter.put("l", "images/black letters/11_black letters.png ");
        letter.put("m", "images/black letters/12_black letters.png ");
        letter.put("n", "images/black letters/13_black letters.png ");
        letter.put("o", "images/black letters/14_black letters.png ");
        letter.put("p", "images/black letters/15_black letters.png ");
        letter.put("q", "images/black letters/16_black letters.png ");
        letter.put("r", "images/black letters/17_black letters.png ");
        letter.put("s", "images/black letters/18_black letters.png ");
        letter.put("t", "images/black letters/19_black letters.png ");
        letter.put("u", "images/black letters/20_black letters.png ");
        letter.put("v", "images/black letters/21_black letters.png ");
        letter.put("w", "images/black letters/22_black letters.png ");
        letter.put("x", "images/black letters/23_black letters.png ");
        letter.put("y", "images/black letters/24_black letters.png ");
        letter.put("z", "images/black letters/25_black letters.png ");
    }
}


