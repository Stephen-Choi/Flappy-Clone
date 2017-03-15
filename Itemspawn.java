import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Itemspawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Itemspawn extends Actor
{
    int counter = 65;
    
    public void act() 
    {
        spawn();
    }    
    
    public void spawn() {
        //creates instancs of item that will be spawned into the game if random is 1 
        Items item = new Items();
        World world;
        world = getWorld();
        
        if (counter == 65) {
            if (Greenfoot.getRandomNumber(2) == 1) {
                    world.addObject(item, getRandom(600, 900), getRandom(100, 500));
            }
            counter = 0;
        }
        counter++;
    }
    
    public int getRandom(int start, int end) {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }
}
