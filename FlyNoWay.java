// Implementation of the FlyBehaviour interface for ducks that cannot fly
public class FlyNoWay implements FlyBehaviour {

    // Implementation of the fly method specified in the FlyBehaviour interface
    @Override
    public void fly() {
        // Output a message indicating that the duck cannot fly
        System.out.println("Cannot Fly");
    }
}
