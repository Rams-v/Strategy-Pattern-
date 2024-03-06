// Implementation of the QuackBehaviour interface for ducks that squeak
public class Squeak implements QuackBehaviour {

    // Implementation of the quack method specified in the QuackBehaviour interface
    @Override
    public void quack() {
        // Output a message indicating that the duck is squeaking
        System.out.println("Duck only Squeaks");
    }
}
