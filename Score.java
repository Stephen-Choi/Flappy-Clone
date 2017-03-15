import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int counter = 0;
    int score = 0;
    boolean isAlive1 = true;
    
    public void act() 
    {
        //setting the score to be everchanging as long as user is still playing
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK));
        draw();
    }    
    
    public void draw() {
        //method to control speed of score increase
            if(isAlive1 == true) {
                if (counter == 20) {
                    score += 1;
                    counter = 0;
                }
                counter++;
        }
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(boolean alive) {
        isAlive1 = alive;
    }
}
