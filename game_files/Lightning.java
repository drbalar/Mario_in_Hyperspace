import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lightning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lightning extends Enemy

{
    /**
     * Act - do whatever the lightning wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    public void act() 
    {
        // Add your action code here.
        Actor player = getOneIntersectingObject(Player.class);
        Actor object = getOneIntersectingObject(Floor.class);
        turn(-10);
        setLocation(getX()-10, getY());
        if(isAtEdge()||object!=null)getWorld().removeObject(this);
        else if(player!=null){
            gameOver();
            getWorld().removeObject(player);
            getWorld().removeObject(this);
        }
    }    
}
