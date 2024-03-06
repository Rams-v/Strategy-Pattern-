// Implementing the SwimBehaviour interface, representing the behavior of drowning
public class Drown implements SwimBehaviour {

    // Implementing the swim method specified in the SwimBehaviour interface
    @Override
    public void swim() {
        // Output a message indicating that the object is drowning
        System.out.println("Drown");
    }
}
