import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Actor
{
    Boolean isAlive = true;
    
    Health health1; 
    
    public void act() 
    {
        healthBar();
        dissapear();
        slider();
    }    
    
    public void healthBar() {
        //method to remove item when touched by the character and also to start the regen method that recovers red health bar
         Background world2 = (Background) getWorld();
         health1 = world2.getHealth();
        
         if(isTouching(Character.class)) {
             isAlive = false;
             health1.regen();
             world2.removeObject(this);
         }
    }
    
    public void dissapear() {
        //method to remove items if they go past the user and off screen
        World world2;
        world2 = getWorld();
        
        if (isAlive) {
            if(getX() < 30) {
                world2.removeObject(this);
            }
        }
    }
    
    public void slider() {
        //moving the items
        if (isAlive) {
            move(-3);
        } 
    }
}
