// Implementation of the SwimBehaviour interface for ducks that can swim
public class Swim implements SwimBehaviour {

    // Implementation of the swim method specified in the SwimBehaviour interface
    @Override
    public void swim() {
        // Output a message indicating that the duck is swimming
        System.out.println("Swimming");
    }
}
