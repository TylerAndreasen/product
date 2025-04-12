
/**
 * The Feature class is intended to be used to represent interactable objects
 * in the game world. This could be anything from a locked door, to a trapped
 * chest, and more. This may also be the root class for any moving creatures or
 * NPCs that we implement as well. Note: Implementing a door that locks off
 * access to another Room should almost certainly be a child class of Feature,
 * rather than hacking it in to the base class.
 * 
 * Implementing the Focusable interface means that objects of the Feature class
 * will have the fields defined in the interface and can have the methods from
 * that interface called on those objects. I am unsure at this time if calling
 * sopl() from within the Feature class without referencing Focusable is
 * possible.
 * 
 * I have not put a lot of thought to what Features will do precisely. I don't
 * have a ton of experience with horror games or what things precisely would
 * make sense to make interactableand as such the story will need to come
 * first. 
 */
@Deprecated
public class Feature extends Focusable
{
    
    //TODO What fields and methods do we need in order to implement the story ideas we have.

    /*
     * The `super(description)` method calls the constructor of the
     * super-class, Focusable. Again some of the docs discuss this as an
     * interface, it is now an abstract class.
     */
    Feature(String description)
    {
        super(description);
        //stub
    }
}