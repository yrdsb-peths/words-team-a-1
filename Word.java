import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor 
{
    //array of letters
    public Letters[] word;   

    int length, letterIndex, firstIndex;     //length of word, index of letter that needs to be typed
    String chosenWord;                       //word chosen
    World world;
    
    public Word(World world) throws IOException
    {
        this.world = world;
        
        setImage((GreenfootImage) null);

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

        letterIndex = firstIndex = 0;
        displayWord();
    }

    public void act()
    {
        //check for keystrokes, update word array's image value
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
                    currentLetter.removeImage(currentLetter.lett);
                    firstIndex++;
                    
                    if(letterIndex == length - 1)
                    {
                        world.removeObject(this);
                    }
                }
                //if letter is incorrect
                else
                {
                    currentLetter.toRed(currentLetter.lett);
                }

                if(letterIndex < length)
                {
                    letterIndex++;
                }
            }
            else if(keyPressed == "backspace" && letterIndex > 0)
            {
                //set current letter to index before to change it back to grey
                currentLetter = word[letterIndex - 1];

                //check if backspaced pressed and word index greater than index of first visible letter
                if(letterIndex > firstIndex || letterIndex == length - 1)
                {
                    currentLetter.toGrey(currentLetter.lett);
                    
                    if(letterIndex > firstIndex)
                    {
                        letterIndex--;
                        System.out.println(currentLetter.letter.get(currentLetter.lett));
                    }
                }
            }
            System.out.println(letterIndex);
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
            world.addObject(word[i], i*30 + 100, 100);
        }
    }
}

