package StrategyDesignPattern.DuckExample;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can quack");
    }
}
