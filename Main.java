// Ramitha V
// 22070126082
// AIML B1


// Main class to demonstrate different types of ducks and their behaviors
public class Main {
    public static void main(String[] args){
        // Create and demonstrate a RedHeadDuck
        RedHeadDuck redHeadDuck =  new RedHeadDuck();
        System.out.println("Demonstrating RedHeadDuck:");
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();
        System.out.println();

        // Create and demonstrate a RubberDuck
        RubberDuck rb = new RubberDuck();
        System.out.println("Demonstrating RubberDuck:");
        rb.display();
        rb.performFly();
        rb.performQuack();
        rb.performSwim();
        System.out.println();

        // Create and demonstrate a MallardDuck
        MallardDuck md = new MallardDuck();
        System.out.println("Demonstrating MallardDuck:");
        md.display();
        md.performFly();
        md.performQuack();
        md.performSwim();
        System.out.println();

        // Create and demonstrate a DecoyDuck
        DecoyDuck dd = new DecoyDuck();
        System.out.println("Demonstrating DecoyDuck:");
        dd.display();
        dd.performFly();
        dd.performQuack();
        dd.performSwim();
        System.out.println();
    }
}
