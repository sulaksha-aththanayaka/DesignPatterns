package StrategyDesignPattern.DuckExample;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Can swim");
    }

    public void display(){
        swim();
    }

    public void performFly(FlyBehavior flyBehavior){
        flyBehavior.fly();
    }

    public void performQuack(QuackBehavior quackBehavior){
        quackBehavior.quack();
    }
}
