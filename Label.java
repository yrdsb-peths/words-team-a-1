import greenfoot.*;

public class Label extends Actor {
    private GreenfootImage image;

    public Label(String text) {
        setText(text);
    }
    
    public Label(String text, int size) {
        image = new GreenfootImage(text, size, Color.BLACK, null);
        setImage(image);
    }
    public void setText(String text) {
        image = new GreenfootImage(text, 19, Color.BLACK, null);
        setImage(image);
    }
}
