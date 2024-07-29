package StrategyDesignPattern.DuckExample;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can squeak");
    }
}
