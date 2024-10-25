import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    int imageIndex = 0;
    GreenfootImage[] idleWalk = new GreenfootImage[6];
    
    public Enemy()
    {
        for(int i = 0; i < idleWalk.length; i++)
        {
            idleWalk[i] = new GreenfootImage("images/enemies/1/walk" + i + ".png");
            idleWalk[i].scale(100,100); 
        }
        
        animationTimer.mark();
        
        setImage(idleWalk[0]); 
    }
    
    public void walkAnimation()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idleWalk[imageIndex]);
        imageIndex = (imageIndex + 1) % idleWalk.length;
    }
    
    public void act()
    {
        walkAnimation(); 
    }
}