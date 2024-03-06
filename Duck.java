// Abstract class representing a Duck
abstract public class Duck {
    // Composition: Each Duck has behavior objects to handle flying, quacking, and swimming
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;

    // Method to set the flying behavior
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    // Method to set the quacking behavior
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    // Method to set the swimming behavior
    public void setSwimBehaviour(SwimBehaviour sb){
        swimBehaviour = sb;
    }

    // Abstract method to display information about the duck
    abstract void display();

    // Method to perform flying behavior
    public void performFly(){
        flyBehaviour.fly();
    }

    // Method to perform quacking behavior
    public void performQuack(){
        quackBehaviour.quack();
    }

    // Method to perform swimming behavior
    public void performSwim(){
        swimBehaviour.swim();
    }
}
