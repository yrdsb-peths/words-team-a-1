import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor
{
    //array of letters
    public Letters[] word;    

    int length, letterIndex, numLeft;     //length of word, index of letter that needs to be typed
    String chosenWord;                       //word chosen
    World world;
    
    public Word(World world) throws IOException
    {
        this.world = world;

        //pick word player has to type
        int line = new Random().nextInt(4279);

        //get word from textfile
        FileInputStream file = new FileInputStream("wordList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        for(int i = 0; i < line; i++)
        {
            br.readLine();
        }
        chosenWord = br.readLine();
        
        //set up array of letters
        length = chosenWord.length();
        word = new Letters[length];

        for(int i = 0; i < length;i++)
        {
            word[i] = new Letters(chosenWord.substring(i,i+1),world);
        }

        letterIndex = numLeft = 0;
        displayWord();
    }

    public void act()
    {
        //check for keystrokes, update word array's image value
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null)
        {        
            Letters currentLetter = word[letterIndex];

            //check if key pressed is a letter, ensure letterIndex is within word index limits
            if(word[0].letter.containsKey(keyPressed) && letterIndex < length)
            {
                //if the letter is correct
                if(keyPressed.equals(currentLetter.lett) && letterIndex == numLeft
                {
                    currentLetter.removeImage(currentLetter.lett);
                    numLeft++;
                }
                //if letter is incorrect
                else
                {
                    currentLetter.toRed(currentLetter.lett);
                }

                if(letterIndex < length - 1)
                {
                    letterIndex++;
                }
            }
            else
            {
                //check if backspaced pressed and word index greater than 0
                if(keyPressed == "backspace" && letterIndex > numLeft)
                {
                    currentLetter.toGrey(currentLetter.lett);
                    if(letterIndex != 0)
                    {
                        letterIndex--;
                    }
                }
            }
            displayWord();
            System.out.println(letterIndex);
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
            world.addObject(word[i], i*30 + 100, 100);
        }
    }
}

