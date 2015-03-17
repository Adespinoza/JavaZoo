/**
 * This is the Animal Class for the Zoo. 
 * 
 * @Adam Espinoza 
 * @2015-03-11
 */
public abstract class Animal
{
    private String description; 
    private String name; 
    
    public Animal (String desc, String name)
    {
        this.description = desc;
        this.name = name; 
    }
    
    public Animal()
    {
        description = "This is a generic animal. Nothing too interesting..."; 
        name = "Animal Something"; 
    }
    
    public String getName()
    {
        return name; 
    }
    
    public String getDescription()
    {
        return description; 
    }
    
    /*#
     * All animals that inherit from this class
     * MUST OVERRIDE the following methods. 
     */
    public abstract String play();
    
    public String sleep()
    {
        return "Zzzzzz.....";
    }
  
    public abstract String eat();
    
    public abstract String makeNoise();
    
    public abstract String move();
}
