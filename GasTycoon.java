import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasTycoon extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GasTycoon()
    {    
        // Create a new world with 10x8 cells with a cell size of 32x32 pixels.
        super(10, 8, 32);
        addObject(new PipeStrait(), 0, 0);
        addObject(new PipeStrait(), 1, 0);
        addObject(new PipeStrait(), 2, 0);
        addObject(new PipeElbow(), 0, 1);
        addObject(new PipeElbow(), 1, 1);
        addObject(new PipeElbow(), 2, 1);
        addObject(new PipeTee(), 0, 2);
        addObject(new PipeTee(), 1, 2);
        addObject(new PipeTee(), 2, 2);
    }
}
