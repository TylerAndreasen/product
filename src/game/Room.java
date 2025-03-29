
/**
 * The Room class will represent places the player can be and travel between. 
 */
public class Room extends Focusable
{

    /**
     * A list of rooms that are adjascent to the current Room.
     * Thought should be put into the type of list used here, as there could be
     * QoL benefit to reordering the list based on what room the player last
     * visted, or maybe the order being consistent no matter where you entered
     * from is preferable.
     */
    private Room[] adjascentRooms;

    /**
     * A list of all features contained in the room.
     * Again, thought to what list type this is and why is advised.
     * If we want to have a monster roaming around that can be interacted with
     * in some way, these lists will need to change in size.
     */
    private Feature[] features;

    Room(String description)
    {
        super(description);
        //stub
    }
}