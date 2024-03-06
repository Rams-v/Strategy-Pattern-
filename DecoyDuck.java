public class DecoyDuck extends Duck {

    // Constructor for DecoyDuck class
    public DecoyDuck() {
        // Setting behaviors for a DecoyDuck:
        // - It cannot quack (Mute behavior)
        quackBehaviour = new Mute();

        // - It cannot fly (FlyNoWay behavior)
        flyBehaviour = new FlyNoWay();

        // - It does not swim (Drown behavior)
        swimBehaviour = new Drown();
    }

    // Override display method to specify how a DecoyDuck is displayed
    @Override
    void display() {
        System.out.println("This is a Decoy Duck");
    }
}
