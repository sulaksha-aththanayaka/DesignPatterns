package StrategyDesignPattern.DuckExample;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
