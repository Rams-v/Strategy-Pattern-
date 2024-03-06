// RubberDuck class, extends Duck class
public class RubberDuck extends Duck {

    // Constructor for RubberDuck class
    public RubberDuck(){
        // Setting behaviors for a RubberDuck:
        // - It cannot fly (FlyNoWay behavior)
        flyBehaviour = new FlyNoWay();

        // - It squeaks (Squeak behavior)
        quackBehaviour = new Squeak();

        // - It floats (Float behavior)
        swimBehaviour = new Float();
    }

    // Override display method to specify how a RubberDuck is displayed
    @Override
    void display() {
        System.out.println("This is a Rubber Duck");
    }
}
