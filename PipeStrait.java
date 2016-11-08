import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipeStrait here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeStrait extends Pipe
{
    /**
     * Act - do whatever the pipeStrait wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            turn(90);
        }
    }    
}
