import greenfoot.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Word extends Actor
{
    //line range = 1 - 4282
    File file = new File("wordList.txt");
    Scanner sc;

    public Word() throws FileNotFoundException
    {
        sc = new Scanner(file);
        int line = new Random().nextInt(4283);

        

    }

}

