
/**
 * Interface for objects which the player can focus on in the world.
 * To be implemented by the Room and Feature classes at time of writing.
 * 
 * For those unfamiliar, Interfaces are ways to package code that can be used
 * across classes without direct inheritance, and give some of the flexibility
 * that C++ header files give. Java Interfaces are not full classes and AFAIK
 * cannot be directly instantiated. 
 * 
 * Notes:
 * The sopl() method is a convienience method I got from one Blanche Cohen.
 * As a part of the Interface, the describe() method does not have to be
 * given a body to compile, but does need to be implemented in all classes
 * the interface is implemented by if it is not supplied a default.
 */
public abstract class Focusable
{

    /**
     * Stores the primary description of the Focusable object.
     * Does this make more sense to express as a String[] or other list?
     */
    protected String description;


    /**
     * A potentially not very useful flag to indicate if this Focusable
     * is the current Focusable the player is looking at. It may be simpler to
     * only ever describe this in the main class. 
     */
    protected boolean isCurrentFocusable = false;

    
    /**
     * I am kinda regretting making this an abstract class, as an abstract
     * class makes little sense to implement a constructor for, though I
     * suppose can be used to define the description only once.
     */
    Focusable(String description)
    {
        this.description = description;
    }

    /**
     * A method to print the description of the Focusable to the console.
     * It may be wise long term to build a system that handles writing text
     * to the console in a more structured way.
     */
    public void describe()
    {
        sopl(this.description);
    }

    /**
	 * Convenience Method: Prints the parameter s via the
	 * {@code System.out.println()} method.
	 *
	 * @param s
	 * @author CanaDev / TylerAndreasen
	 */
	private static void sopl(String s)
	{
		System.out.println(s);
	}
}