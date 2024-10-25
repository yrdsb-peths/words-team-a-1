import greenfoot.*;

public class Label extends Actor {
    private GreenfootImage image;

    public Label(String text) {
        setText(text);
    }

    public void setText(String text) {
        image = new GreenfootImage(text, 18, Color.BLACK, Color.WHITE);
        setImage(image);
    }
}
