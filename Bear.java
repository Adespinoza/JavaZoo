import java.util.List;
import java.util.ArrayList;
/**
 * This is the bear class that has a bunch of cool methods!
 * 
 * @author Adam Espinoza    
 * @version 03-13-15
 */
public class Bear extends Animal 
{
    private List<String> toys;
    
    /**
     * Constructor for objects of class Bear
     */
    public Bear(String name, String description, String toy)
    {
        super(description, name); 
        //description = "This a standard looking bear in all respects. Use your imagination.";
        toys = new ArrayList<String>();
        toys.add(toy);
    }
    
    public Bear()
    {
        super("A general bear.", "General Bear");
        toys = new ArrayList<String>(); 
        toys.add("Beach Ball");
    }

    /**
     * Makes any general bear respond with a roar
     * @return String contating "RAAAAAAAAAAWR"
     */
    public String roar()
    {
        return "RAAAAAAAAAAWR";
    }
    
    /**
     * Makes any general bear respond in sleep
     * @return String contating "zzzzzzzzz"
     */
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    /**
     * Makes any general bear play
     * If it has a toy, it will respond differently
     */
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "The bear plays with his "+ toy +".\n";
        }
        return playing;
    }
    
    /**
     * Makes any general bear eat a volunteer.
     * @return String contating "The bear reaches through the bars and eats a volunteer"
     */
    public String eat()
    {
        return "The bear reaches through the bars and eats a volunteer";
    }
    
    /**
     * Overrides the move method in the <<abstract>> Animal class.
     * @returns the phrase "The bear waddles back on forth on both legs in a labrous fashion."
     */
    @Override
    public String move()
    {
        return "The bear waddles back on forth on both legs in a labrous fashion.";
    }
    
    /**
     * Overrides the makeNoise() method in <<abstract>> Animal class. 
     * @return String contating "RAWR"
     */
    @Override 
    public String makeNoise()
    {
        return "RAWR!"; 
    }
   
}
