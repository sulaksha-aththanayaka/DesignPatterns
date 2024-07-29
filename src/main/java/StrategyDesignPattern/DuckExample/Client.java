package StrategyDesignPattern.DuckExample;

public class Client {
    public static void main(String[] args){
        System.out.println("Mallard duck: ");
        Duck duck = new Duck(new FlyWithWings(), new Quack());
        duck.performFly(new FlyWithWings());
        duck.performQuack(new Quack());

        System.out.println("Rubber duck: ");
        duck.performFly(new FlyNoWay());
        duck.performQuack(new Squeak());


        System.out.println("Decoy duck: ");
        duck.performFly(new FlyNoWay());
        duck.performQuack(new MuteQuack());
    }
}
