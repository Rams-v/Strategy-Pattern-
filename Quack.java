// Implementation of the QuackBehaviour interface for ducks that can quack
public class Quack implements QuackBehaviour {

    // Implementation of the quack method specified in the QuackBehaviour interface
    @Override
    public void quack() {
        // Output a message indicating that the duck is quacking
        System.out.println("Duck Quacks");
    }
}
