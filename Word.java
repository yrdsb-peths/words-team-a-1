import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor 
{
    //array of letters
    public List<Letters> word = new ArrayList<>();

    int length, letterIndex, firstIndex;       //length of word, current index of letter, index of first visible letter
    String chosenWord;                         //word player has to type
    World world;                               //world we're currently in

    public Word(World world) throws IOException
    {
        setImage((GreenfootImage) null);

        this.world = world;

        chosenWord = getWord();
        
        //set up array of letters
        length = chosenWord.length();

        //put Letters into word list
        for(int i = 0; i < length; i++)
        {
            word.add(i,(new Letters(chosenWord.substring(i,i+1), world)));
        }

        letterIndex = 0;
        firstIndex = 0;
        displayWord();
    }

    public void act()
    {
        //check for keystrokes, update letters's image value
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null)
        {        
            Letters currentLetter;

            //check if key pressed is a letter, ensure letterIndex is within word index limits
            if(word.get(0).letter.containsKey(keyPressed) && letterIndex < length)
            {
                //currentLetter = word[letterIndex];
                currentLetter = word.get(letterIndex);

                //if the letter is correct
                if(keyPressed.equals(currentLetter.lett) && letterIndex == firstIndex)
                {
                    //remove image
                    currentLetter.removeImage(currentLetter.lett);
                    firstIndex++;
                    
                    //if letter was the last one, remove entire word from world
                    if(letterIndex == length - 1)
                    {
                        ((MyGame) getWorld()).addWord();
                        ((MyGame) getWorld()).score += 100;
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
            else if(keyPressed.equals("backspace") && letterIndex > 0)
            {
                //set current letter to previous index to change it back to grey
                currentLetter = word.get(letterIndex - 1);

                //word index greater than index of first visible letter
                if(letterIndex > firstIndex || letterIndex == length - 1)
                {
                    currentLetter.toBlack(currentLetter.lett);
                    
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

        
        //add letters to world
        for(int i = 0; i < length; i++)
        {
            world.addObject(word.get(i), (i*40) + 20 + xConstant(), 140);
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
        int line = new Random().nextInt(3957);

        //get word from textfile
        FileInputStream file = new FileInputStream("wordList.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(file)))
        {
            for(int i = 0; i < line; i++)
            {
                br.readLine();
            }
            return br.readLine();
        }
    }

    /**
     * Calculates constant x value to center letters on screen
     */
    private int xConstant()
    {
        return ((world.getWidth()/2) - (length/2 * 40));
    }
}

