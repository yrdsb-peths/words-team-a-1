import greenfoot.*;

public class Avatar extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    int imageIndex = 0;
    GreenfootImage[] idle = new GreenfootImage[5]; 
    GreenfootImage[] attack = new GreenfootImage[8];
    public Avatar()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/avatars/1/idle" + i + ".png");
            idle[i].scale(100,100); 
        }
        
        animationTimer.mark();
        
        setImage(idle[0]); 
    }
    
    public void animateAvatar()
    {
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void attackAnimation()
    {
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(attack[imageIndex]);
        imageIndex = (imageIndex + 1) % attack.length;
    }
    
    public void act()
    {
        animateAvatar(); 
    }
}
