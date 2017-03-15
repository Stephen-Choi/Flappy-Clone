import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    boolean stillAlive = true; 
    
    public void act() 
    {
            jump();
            floorCollision();
            pipeCollision();
            destroy();
    }    

    public void jump() {
        //method to allow user to control the jumping of the character
        if (Greenfoot.isKeyDown("space")) {
            setLocation(130, getY() - 15);
            Greenfoot.delay(1);
        } else {
            setLocation(130, getY() + 5);
            Greenfoot.delay(1);
        }
    }
    
    public void floorCollision() {
        //method to end game if user touches the floor
        if (getY() == 600) {
            setRotation(90);
            
            Background world2 = (Background)getWorld();
            Retry retry = new Retry();
            Gameover over = new Gameover();
            Score score = world2.getScore();
            Health health = world2.getHealth();     //creating instances of the objects that need to appear when game ends
            
            world2.addObject(over, 530, 230);    //spawning the objects
            world2.addObject(retry, 530, 430);
           
            health.setAlive(false);     //stopping the red health bar from moving
            score.setScore(false);     //stopping score
            stillAlive = false;       
        }
    }
    
    public void pipeCollision() {
        if (isTouching(Obstacles.class)) {
            //method to end game if the character comes into contact with the pipes
            setLocation(150, getY());
            setRotation(90);

            Background world2 = (Background)getWorld();
            Retry retry = new Retry();
            Gameover over = new Gameover();
            Score score = world2.getScore();
            Health health = world2.getHealth();
            
            world2.addObject(over, 530, 230);
            world2.addObject(retry, 530, 430);
            
            health.setAlive(false);
            score.setScore(false);
            stillAlive = false;
        } 
    }
    
    public void dead() {
        //method to be used in other classes when character dies (mainly for the health bar)
        setRotation(90);
    }
    
    public void destroy() {
        //removing bird from game when dead
        if (stillAlive == false) {
            getWorld().removeObject(this);
        }
    }
    
    public boolean alive() {
        //for other classes to see if the user lost or is still in game
        return stillAlive;
    }
}

