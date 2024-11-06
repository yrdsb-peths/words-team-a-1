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
            String newImage = "images/redLetters/";
            newImage = newImage.concat(letter.get(key).substring(20,23) + "redLetters.png");

            System.out.println(newImage);

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
            String newImage = "images/blackLetters/";
            newImage = newImage.concat(letter.get(key).substring(18,21) + "blackLetters.png");


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
            image.scale(40,40);
            setImage(image);
        }
    }

    /**
     * This method fills the hashmap with all the letters
     */
    public void fillMap()
    {
        //put all letters into hashmap
        letter.put("a", "images/blackLetters/00_blackLetters.png");
        letter.put("b", "images/blackLetters/01_blackLetters.png");
        letter.put("c", "images/blackLetters/02_blackLetters.png");
        letter.put("d", "images/blackLetters/03_blackLetters.png");
        letter.put("e", "images/blackLetters/04_blackLetters.png");
        letter.put("f", "images/blackLetters/05_blackLetters.png");
        letter.put("g", "images/blackLetters/06_blackLetters.png");
        letter.put("h", "images/blackLetters/07_blackLetters.png");
        letter.put("i", "images/blackLetters/08_blackLetters.png");
        letter.put("j", "images/blackLetters/09_blackLetters.png");
        letter.put("k", "images/blackLetters/10_blackLetters.png");
        letter.put("l", "images/blackLetters/11_blackLetters.png");
        letter.put("m", "images/blackLetters/12_blackLetters.png");
        letter.put("n", "images/blackLetters/13_blackLetters.png");
        letter.put("o", "images/blackLetters/14_blackLetters.png");
        letter.put("p", "images/blackLetters/15_blackLetters.png");
        letter.put("q", "images/blackLetters/16_blackLetters.png");
        letter.put("r", "images/blackLetters/17_blackLetters.png");
        letter.put("s", "images/blackLetters/18_blackLetters.png");
        letter.put("t", "images/blackLetters/19_blackLetters.png");
        letter.put("u", "images/blackLetters/20_blackLetters.png");
        letter.put("v", "images/blackLetters/21_blackLetters.png");
        letter.put("w", "images/blackLetters/22_blackLetters.png");
        letter.put("x", "images/blackLetters/23_blackLetters.png");
        letter.put("y", "images/blackLetters/24_blackLetters.png");
        letter.put("z", "images/blackLetters/25_blackLetters.png");
    }
}