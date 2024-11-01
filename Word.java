import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor 
{
    //array of letters
    public Letters[] word;   

    int length, letterIndex, firstIndex;     //length of word, current index of letter, index of first visible letter
    String chosenWord;                       //word player has to type
    World world;                             //world we're currently in

    public Word(World world) throws IOException
    {
        this.world = world;
        chosenWord = getWord();
        
        //set up array of letters
        length = chosenWord.length();
        word = new Letters[length];

        for(int i = 0; i < length;i++)
        {
            word[i] = new Letters(chosenWord.substring(i,i+1),world);
        }

        letterIndex = firstIndex = 0;
        displayWord();
        setImage((GreenfootImage) null);

    }

    public void act()
    {
        //check for keystrokes, update letters's image value
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null)
        {        
            Letters currentLetter;

            //check if key pressed is a letter, ensure letterIndex is within word index limits
            if(word[0].letter.containsKey(keyPressed) && letterIndex < length)
            {
                currentLetter = word[letterIndex];

                //if the letter is correct
                if(keyPressed.equals(currentLetter.lett) && letterIndex == firstIndex)
                {
                    //remove image
                    currentLetter.removeImage(currentLetter.lett);
                    firstIndex++;
                    
                    //if letter was the last one, remove entire word from world
                    if(letterIndex == length - 1)
                    {
                        world.removeObject(this);
                    }
                }
                //switch colour to red if letter typed is incorrect
                else
                {
                    currentLetter.toRed(currentLetter.lett);
                }

                //increase index user is currently on
                if(letterIndex < length)
                {
                    letterIndex++;
                }
            }
            else if(keyPressed == "backspace" && letterIndex > 0)
            {
                //set current letter to previous index to change it back to grey
                currentLetter = word[letterIndex - 1];

                //word index greater than index of first visible letter
                if(letterIndex > firstIndex || letterIndex == length - 1)
                {
                    currentLetter.toGrey(currentLetter.lett);
                    
                    //decrease index user is currently on (move back a letter)
                    if(letterIndex > firstIndex)
                    {
                        letterIndex--;
                    }
                }
            }
            //update letters on screen
            displayWord();
        }
    }

    /**
     * Display letter images on screen
     */
    private void displayWord()
    {
        world.removeObjects(world.getObjects(Letters.class));
        //add letters to array word, add letters to world
        for(int i = 0; i < length; i++)
        {
            world.addObject(word[i], i*40 + getXConstant(), 100);
        }
    }

    /**
     * Returns the word the user has to type from textfile
     * @return 
     * @throws IOException
     */
    private String getWord() throws IOException
    {
        //pick line player has to type
        int line = new Random().nextInt(3982);

        //get word from textfile
        FileInputStream file = new FileInputStream("wordList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        for(int i = 0; i < line; i++)
        {
            br.readLine();
        }
        return br.readLine();
    }

    /**
     * Calculates constant x value to center letters on screen
     */
    private int getXConstant()
    {
        return ((world.getWidth()/2) - (length/2 * 40));
    }
}

