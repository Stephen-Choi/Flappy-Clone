import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    boolean isAlive = true;
    
    public void act() 
    {
        die();
        end();
    }    
    
    public void die() {
        //method that slowly decreases the red health bar of the player
        if (isAlive == true) {
            counter++;
            if(counter == 5) {
                move(-1);
                counter = 0;
            }
        }
    }
    
    public void end() {
        //method to stop gameplay when the health bar reaches the gray 
        if(getX() == 101) {
            Background world2 = (Background) getWorld();
            Character birdy = world2.getCharacter();
            
            world2.removeObject(birdy);
      
            Retry retry = new Retry();
            Gameover over = new Gameover();
            Score score = world2.getScore();
            Health health = world2.getHealth();
            
            world2.addObject(over, 530, 230);
            world2.addObject(retry, 530, 430);
           
            health.setAlive(false);
            score.setScore(false);
            move(-1);
        }
    }
    
    public void regen() {
        //gives user more health if they touch an item
        move(55);
    }
    
    public void setAlive(boolean alive) {
        //for other closes to control if health should move or not
        isAlive = alive;
    }
}   
