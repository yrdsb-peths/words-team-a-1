import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WhiteLabel extends Actor
{
    private GreenfootImage image;

    public WhiteLabel(String text) {
        setText(text);
    }
    
    public WhiteLabel(String text, int size) {
        image = new GreenfootImage(text, size, Color.WHITE, null);
        setImage(image);
    }
    
    public void setText(String text) {
        image = new GreenfootImage(text, 24, Color.WHITE, null);
        setImage(image);
    }
}
