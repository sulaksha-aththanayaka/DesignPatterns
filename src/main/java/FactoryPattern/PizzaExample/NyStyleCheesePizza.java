package FactoryPattern.PizzaExample;

public class NyStyleCheesePizza implements Pizza{
    @Override
    public void description() {
        System.out.println("This is Ny style cheese pizza");
    }
}
