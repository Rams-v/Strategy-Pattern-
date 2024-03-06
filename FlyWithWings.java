// Implementation of the FlyBehaviour interface for ducks that can fly with wings
public class FlyWithWings implements FlyBehaviour {

    // Implementation of the fly method specified in the FlyBehaviour interface
    @Override
    public void fly() {
        // Output a message indicating that the duck is flying with wings
        System.out.println("Flying with Wings");
    }
}
