import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor
{
    //[char][associated image]
    public Letters[] word;    
    int length;
    String chosenWord;
    
    public Word() throws IOException
    {
        //pick word player has to type
        int line = new Random().nextInt(4279);

        FileInputStream file = new FileInputStream("wordList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        for(int i = 0; i < line; i++)
        {
            br.readLine();
        }
        
        chosenWord = br.readLine();
        
        length = chosenWord.length();
        word = new Letters[length];
    }

    public void act()
    {
        displayWord();

        //check for keystrokes, update word array's image value
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null)
        {
            System.out.println(keyPressed);
        }

        //update images
    }

    /**
     * Display letter images on screen
     */
    private void displayWord()
    {
        //add letters to array word, add letters to world
        for(int i = 0; i < length; i++)
        {
            word[i] = new Letters(chosenWord.substring(i,i+1));
            getWorld().addObject(word[i], i*30 + 100, 100);
        }
    }

    /**
     * change word depending on 
     */
    private void checkWordLength()
    {

    }

    

}

