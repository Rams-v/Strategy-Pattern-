// RedHeadDuck class, extends Duck class
public class RedHeadDuck extends Duck {

    // Constructor for RedHeadDuck class
    public RedHeadDuck(){
        // Setting behaviors for a RedHeadDuck:
        // - It can quack (Quack behavior)
        quackBehaviour = new Quack();

        // - It can fly with wings (FlyWithWings behavior)
        flyBehaviour = new FlyWithWings();

        // - It can swim (Swim behavior)
        swimBehaviour = new Swim();
    }

    // Override display method to specify how a RedHeadDuck is displayed
    @Override
    void display(){
        System.out.println("This is a RedHead Duck");
    }
}
