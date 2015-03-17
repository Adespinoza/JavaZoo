
/**
 * Tis a circus bear doing it's thing. 
 * 
 * @Adam Espinoza 
 * @2015-15-03
 */
public class CircusBear extends Bear
{
    /**
     * Constructor for objects of class CircusBear
     */
    public CircusBear (String name, String description, String toy)
    {
        super(name, description, toy) ;
    }

    @Override
    public String play()
    { 
        double value = Math.random();
        
        if(value >= .5)
        {
            return "Casey puts on his hat and rides his tricycle.";
        }
        else if(value <= .4)
        {
            return "The circus bear is shot out of a canon and dies upon impact. We are mourning his death."; 
        }
        else
        {
            return super.play();
        }
    }

}
