import greenfoot.*;

public class Label extends Actor {
    private GreenfootImage image;

    public Label(String text) {
        setText(text);
    }

    public void setText(String text) {
        image = new GreenfootImage(text, 24, Color.WHITE, Color.BLACK);
        setImage(image);
    }
}
