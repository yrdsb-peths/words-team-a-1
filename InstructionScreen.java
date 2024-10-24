import greenfoot.*;

public class InstructionScreen extends World {
    private String[] instructions = {
        "In order to defeat the enemy, you must quickly type words that appear on a screen.",
        "Instruction 2: Use arrow keys to move.",
        "Instruction 3: Collect items to score."
    };
    private int currentIndex = 0;
    private Label instructionLabel;
    private Button nextButton;

    public InstructionScreen() {
        super(600, 400, 1);
        instructionLabel = new Label(instructions[currentIndex]);
        addObject(instructionLabel, 300, 200); 

        addObject(new Button(this::previousInstruction), 100, 300); 
        addObject(new Button(this::nextInstruction), 500, 300); 
    }

    private void previousInstruction() {
        if (currentIndex > 0) {
            currentIndex--;
            updateInstruction();
        }
    }

    private void nextInstruction() {
        if (currentIndex < instructions.length - 1) {
            currentIndex++;
            updateInstruction();
        }
        else
        {
             //goToAvatarSelection();
        }
    }

    private void updateInstruction() {
        instructionLabel.setText(instructions[currentIndex]);
    }
}
