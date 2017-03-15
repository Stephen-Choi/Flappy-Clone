import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    Obstacles top;
    Obstacles bottom;
    
    int timer = 140;
    
    public void act() 
    {
        top = new Obstacles();
        bottom = new Obstacles();
        spawn();
    }    
    
    public void spawn() {
        //spawns obstacles to game, the obstacles always have the same distance
        if(timer == 140) {
            World world = getWorld();
            world.addObject(top, 850, getRandom(-255, 50));
            world.addObject(bottom, 850, (top.getY() + 725));
            
            timer = 0;
        }
        
        timer++;
    }
    
    public int getRandom(int start, int end) {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }
}
