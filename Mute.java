// Implementation of the QuackBehaviour interface for ducks that cannot quack
public class Mute implements QuackBehaviour {

    // Implementation of the quack method specified in the QuackBehaviour interface
    @Override
    public void quack() {
        // Output a message indicating that the duck is mute (cannot quack)
        System.out.println("Mute");
    }
}
