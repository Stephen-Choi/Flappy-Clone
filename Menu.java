import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
     Start start = new Start();
     Instructions ins = new Instructions();
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        //create the menu 
        addObject(start, 500, 500);
        
        addObject(ins, 500, 220);
    }
    
    public void act() {
        Background back = new Background();
        if (Greenfoot.mouseClicked(start))
        {
            Greenfoot.setWorld(back);
        }
    }
}
