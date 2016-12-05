import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
        createContentSample2();
    }

    public void act() {
        String key = Greenfoot.getKey();
        if (key != null) {
            System.out.println("key: " + key);
            if (key.equals("s")) {
                showActors();
            }
            else if (key.equals("j")) {
                showActorsAsJson();
            }
        }
    }
    
    private void createContent() {
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

    private void createContentSample1() {
        addObject(new PipeStrait(), 1, 0);
        Actor actor = getObjectsAt(1, 0, Pipe.class).get(0);
        System.out.println("show current rotation: " + actor.getRotation());
        actor.turn(90);
        System.out.println("show current rotation: " + actor.getRotation());
        
        actor = new GasBurner();
        actor.turn(90);
        addObject(actor, 0, 0);
        actor = new GasTank();
        actor.turn(270);
        addObject(actor, 2, 0);
        
    }
    
    public void createContentSample2() {
        addObject(new PipeStrait(), 0, 1);
        Actor actor = getObjectsAt(0, 1, Pipe.class).get(0);
        show(actor);
        
        actor = new GasBurner();
        actor.turn(180);
        addObject(actor, 0, 0);
        show(actor);

        actor = new GasTank();
        actor.turn(0);
        addObject(actor, 0, 2);
        show(actor);
    }

    private void showActors() {
        List<Pipe> actors = getObjects(Pipe.class);
        for (Actor actor : actors) {
            show(actor);
        }
    }

    public void show(Actor actor) {
        System.out.println("Actor:" + actor.getClass().getName() + "  x:" + actor.getX() + "  y:" + actor.getY() + "  r:" + actor.getRotation());
    }

    private void showActorsAsJson() {
        List<Pipe> actors = getObjects(Pipe.class);
        StringBuilder bldr = new StringBuilder();
        bldr.append("{\n");
        bldr.append("\"actors\": [");
        boolean isFirstActor = true;
        for (Actor actor : actors) {
            if (!isFirstActor) {
                bldr.append(",\n");
            }
            showAsJson(bldr, actor);
            isFirstActor = false;
        }
        bldr.append("]\n");
        bldr.append("}\n");
        System.out.println(bldr);
    }

    private void showAsJson(StringBuilder bldr, Actor actor) {
        bldr.append("{");
        bldr.append("\n");
        bldr.append("\"type\": \"").append(actor.getClass().getName()).append("\",");
        bldr.append("\n");
        bldr.append("\"x\": ").append(actor.getX()).append(",");
        bldr.append("\n");
        bldr.append("\"y\": ").append(actor.getY()).append(",");
        bldr.append("\n");
        bldr.append("\"r\": ").append(actor.getRotation()).append("");
        bldr.append("\n");
        bldr.append("}");
        bldr.append("\n");
    }
    
}
