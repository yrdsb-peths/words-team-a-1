import greenfoot.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class Word extends Actor
{
    //[char][associated image]
    public String[][] word;

    //line range = 1 - 4282
   // File file = new File("wordList.txt");
    Scanner sc;

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
        System.out.println(br.readLine());

        //turn word selected into array

        //add images into array based on letter 
        
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
    }

    /**
     * change word depending on 
     */
    private void checkWordLength()
    {

    }

    

}

