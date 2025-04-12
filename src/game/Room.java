
/**
 * The Room class will represent places the player can be and travel between. 
 */
public class Room //extends Focusable
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
    // private Feature[] features;


    /**
     * Note: When the Focusable interface is fleshed out, the description will
     * be removed from this class and the field from Focusable will be used.
     * 
     * This field should contain details about what is in this room.
     */
    private String description;

    /**
     * This field should contain a 1-3 word name of the room, used when other
     * rooms are describing their adjascent rooms.
     * Note: This is not a unique ID
     */
    private String tagline;

    Room(String description)
    {
        this.description = description;
    }

    private boolean hasAdjscentRooms() { return 1 > this.adjascentRooms.length; }

    public String getDescription()
    {
        return this.description;
    }

    /**
     * Returns the taglines of this room's adjascent rooms
     * @return String[] of adjascent Rooms
     */
    public String[] getAdjascentTagLines()
    {
        if (!this.hasAdjscentRooms())
        {
            return new String[]
            {
                "Please contact development, this Room has no adjascent Rooms.",
                "Tagline: " + this.tagline,
                "Description: " + this.description
            };
        }
        String[] out = new String[this.adjascentRooms.length];


        for (int i = 0; i < adjascentRooms.length; i++)
        {
            out[i] = "" + ( i + 1) + ". " + adjascentRooms[i].getTagLine();
        }

        return out;
    }

    public Room getAdjascentRoom(int index)
    {
        if (!this.hasAdjscentRooms() || index > this.adjascentRooms.length) return this;
        else return this.adjascentRooms[index];
    }

    public void describe()
    {
        sopl(this.getDescription());
    }

    public String getTagLine() { return this.tagline; }
 
    private static void sopl(String s) { System.out.println(s); }

    private static void sop(String s){ System.out.print(s); }
}