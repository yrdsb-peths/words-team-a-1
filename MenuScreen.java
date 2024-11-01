import greenfoot.*;

public class MenuScreen extends World {
    public MenuScreen() {
        super(600, 400, 1);
         
        setBackground(new GreenfootImage("7481714.png"));
        addObject(new Label ("Welcome to the [..] Game!"),300, 200); 
        addObject(new Label ("Click the Start Button to read the instructions and begin the game!"),300, 220);
        addObject(new Button(this::startInstructions), 300, 300); 
        String start = "Start"; 
        addObject(new Label ("Start"), 300, 300); 
         
    }

    private void startInstructions() {
        Greenfoot.setWorld(new InstructionScreen());
    }
}
