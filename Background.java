import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    Health health = new Health();
    Character bird = new Character(); 
    Menu menu = new Menu();
    Score score = new Score();
    
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false); 
        
        //Initiate the spawner that will create the blocks to avoid
        Spawner spawner = new Spawner();
        addObject(spawner, 0, 0);
        
        //initiate the spawn class to get items into the game 
        Itemspawn spawn = new Itemspawn();
        addObject(spawn, 0, 0);
        
        //spawn character 
        addObject(bird, 130, 300);
        
        //create health bar (gray part)
        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        
        //create and place the score counter
        addObject(score, 920, 40);
        
        //adding to game
        addObject(box, 100, 50);
        addObject(box1, 235, 50);
        addObject(box2, 375, 50);
        addObject(health, 275, 50);
        
        Greenfoot.setSpeed(50);
        Greenfoot.start();
    }
    
    public int getRandom(int start, int end) {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }
    
    
    public Health getHealth() {
        return health;
    }
    
    public Character getCharacter() {
        return bird;
    }
    
    public Score getScore() {
        return score;
    }
    
    public Background getBack() {
        return this;
    }
}
