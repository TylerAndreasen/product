# Engine Concept 1

NOTE: I am not declaring this model is how we will or should do things, but I am proposing a stucture that makes sense to me. If something does not make sense, please ask about it. If something I describe works in a way you this could be better, please present the idea, this is a collaborative project of peers. I don't intend to be in charge.

NOTE: Writing this before writing the code outline means that I ended up using an `abstract class` instead of an `interface`, though it should change little about how we interact with things and how the engine is built beyond syntax in the Focusable class. Any time the following talks about the `Focusable interface`, I retroactively mean the abstract class.

NOTE: The classes I wrote for this model compile but are not run by the jar.

I have some ideas about how to design the concepts Toren and I discussed on the March 22nd over discord, and wanted to write them down explicitly for you all. Generally this is split into two parts: The Game Loop, and The Game Data. Note: it is tricky to talk about the two pieces separately, so be aware that the sum of the two following parts should be more cohesive, and will be expanded on afterwards.

### The Data

I would propose that we separate the data we need to organize the game into several classes, including potential interfaces (a Java based way of implementing shared functionality that applies to multiple classes that don't decend from each other. This is not totally disimilar to C++ header files). Note on Java: Objects are pass-by-reference, and primitives are pass-by-value.

1. Room : Sensibly, this would represent a bounded space within the game world (something we should also talk about in more detail.) One Room at a time is declared to be the Room the player is in, and some number of other Rooms are listed as the adjascent as data within the room. In order to describe to the player what is in the Room, I propose that the Room class implements a Focusable Interface, See 3. Focusable.
2. Feature : While some rooms will contain little of interest to a player based on the theme of the game, others will need to have interactble elements to make them interesting. A Feature is the (highest-level of?) class which gives structure to how interactable elements in the world exist. Given the potentially quite complex nature of some interactable elements, implementing Focusable as an interface to describe things to the player I believe to be valuable quite valuable, as we will only need to implement it once.
3. Focusable : The Focusable interface would define several non-static fields and methods that handle describing the object to the player. At this time, things like describing the Rooms adjascent to the current/options for interaction with a Feature are handled. These may be class called Selection, which stores a descriptor for what the action is (move to room/interact with feature), and a list is stored, allowing the functionality to be implemented by Room and Feature, or if the two should be implemented separately.  

### The Loop

Every big budget game engine I have seen implements the idea of a loop, and during each loop is when things are updated according to rules written in code. During these loops objects move, shapes are drawn, scoring and other game logic is operated. Also during the loop, user input is listened for. (Aside: The way we take in user input during the loop will look different from a typical game engine, as we need time-deliniated inputs, where most 2- or 3-D engines want to be able to respond to user input whenever it arrives, though this also depends on the game).

(Assuming set up work is done before beginning the loop) 

0. Loop Start
1. The loop will check what Room the player is in, describe the Room, and list the adjascent Rooms to move to & list any Features in the Room.
2. The loop gives a prompt and waits for the user to enter a selection. 
3. The Player gives an input ending with `Enter`.
4. If the input is valid for the methodology of selection we choose (numbers, keywords, et cetera), determine which selection the user intends.
    4.1. If the selection is another Room, change the current Room and Focused object to the selected Room and jump to the start of the loop.
    4.2. If the selection is a Feature, leave the current Room as is but changed the focused object to the selected feature.
    4.3. (More time and implementation will be required to decide and describe how interacting with features will be implemented).
    4.4. If the selection indicates the player wants to quit, exit the loop.
5. In the case that the input is not valid. 1) Do we write a message back to the player saying the input could not be read? 2) Do not change the current room or focusable and jump back to the start of the loop.


### Discussion

The premise of the Rooms listing other Rooms is essentially a comp.sci. Graph. A set of Vertices and a set of Edges between Vertices (this will make more sense later in Discrete). Having each Room store its adjascent rooms keeps us from using a list of all room connections/doorways (though that is a valid way to implement this). I want to hear what your thoughts are on the structure and implementation. Also, if there are structural things that may be better changed in the light of making a horror game, throw out ideas.