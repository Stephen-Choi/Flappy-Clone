import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacles extends Actor
{
    boolean obst = true;
    
    public void act() 
    {
        // Add your action code here.
        slide();
        leave();
    }   
    
    public void slide() {
       //move the obstsacles
       if (obst == true) {
           move(-3);
        }
    }
    
    public void leave() {
        //method to remove the obstacles after they move out of the user's screen
            if(getX() < 30) {
                World world1;
                world1 = getWorld();
                obst = false;
                world1.removeObject(this);
            }
    }
}
