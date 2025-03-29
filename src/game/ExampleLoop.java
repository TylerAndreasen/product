
/**
 * This is an example Main class for the purposes of expressing how I think
 * the engine will function. The main() does not actually implement anything of
 * consequence but does express the general flow in a block comment. 
 */
public class ExampleLoop
{

    /**
     * A list of all Rooms in the game.
     * For the running game, there is little need for novel rooms to be created
     * deleted at runtime, just loaded from file, so I think that loading into
     * an array is preferable to a dynamic structure.
     * For a separate file that allows us to define Rooms via commandline,
     * a dynamic list will be necessary.
     */
    private Room[] allRooms;


    /**
     * The currentRoom is vital to the logic of the engine.
     * At any one time, the player must be in one and only one place, and they
     * need to have location described to them.
     */
    private Room currentRoom;

    /**
     * The focus variable is key for allowing a player to focus on an
     * interactable object within a Room, and avoid having to bake all
     * functionality directly into a the concept of a Room.
     * That said, a room can be the focus of the player if they are not
     * looking at a Feature or are in a room without any Features.
     */
    private Focusable focus = new Room("Garbage In, Garbage Out");

    /**
     * This is a static code block in Java, a tool I learned about recently and
     * think will benefit this sort of project. Off of the bat, we will need to
     * manually create the data for rooms and features, but serializing objects
     * into files will be a key speed up step for implementing written story
     * ideas. 
     */
    static
    {
        // Create or read from file all rooms and contained features in a loop
    }

    
    public static void main(String[] args)
    {
        /**
         * Pseudo:
         * 
         * Print Greeting message
         * Load Room objects (hand written or read from file)
         * Locate starting room and assign to currentRoom and to current Focusable.
         * Complete any other load tasks
         * 
         * Loop Start:
         *      if currentRoom != focus
         *          describe focus
         *          ONCE IMPLEMENTED list options on Feature
         *      else
         *          describe currentRoom
         *          if currentRoom has ZERO features
         *              state 'nothing of interest'
         *          else 
         *              list features
         *          list adjascent rooms
         *      
         *      Take user input line
         *      Parse user input (it is always evil)
         *      if user input is valid for input scheme
         *          if user input matches adjascent room option
         *              set tempRoom to adjascent room from currentRoom
         *              set currentRoom to tempRoom
         *              set focus to currentRoom
         *          if user input matches feature interaction
         *              call on feature object to respond to action
         *              ?? Does interacting with a feature ever make sense kick the player back to the room as a focus
         * 
         *      ??How to actually or practically clear the console? Does it make more sense to leave the previous text 
         *          available in the console for player reference?
         *              
         * 
         */
    }
    
}