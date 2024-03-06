// MallardDuck class, extends Duck class
public class MallardDuck extends Duck {

    // Constructor for MallardDuck class
    public MallardDuck(){
        // Setting behaviors for a MallardDuck:
        // - It can quack (Quack behavior)
        quackBehaviour = new Quack();

        // - It can fly with wings (FlyWithWings behavior)
        flyBehaviour = new FlyWithWings();

        // - It can swim (Swim behavior)
        swimBehaviour = new Swim();
    }

    // Override display method to specify how a MallardDuck is displayed
    @Override
    void display() {
        System.out.println("This is a Mallard Duck");
    }
}
