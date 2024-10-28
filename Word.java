import greenfoot.*;
import java.util.*;
import java.io.*;

public class Word extends Actor
{
    //[char][associated image]
    public String[][] word;    
    Letters letter = new Letters();
    int length;
    
    public Word() throws IOException
    {
        //pick word player has to type
        int line = new Random().nextInt(4283);

        FileInputStream file = new FileInputStream("wordList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        for(int i = 0; i < line; i++)
        {
            br.readLine();
        }
        
        String chosenWord = br.readLine();
        
        length = chosenWord.length();
        word = new String[length][2];
        
        //turn word selected into array
        for(int i = 0; i < length;i++)
        {
            String currentLetter = chosenWord.substring(i,i+1);
            word[i][0] = currentLetter;
            word[i][1] = Letters.letter.get(currentLetter);
            
            System.out.println(word[i][0] + ": " + word[i][1]);
        }
    }

    public void act()
    {
        displayWord();

        //check for keystrokes, update word array's image value

        //update images
    }

    /**
     * Display letter images on screen
     */
    private void displayWord()
    {
        for(int i = 0; i < length; i++)
        {
            
        }
    }

    /**
     * change word depending on 
     */
    private void checkWordLength()
    {

    }

    

}

