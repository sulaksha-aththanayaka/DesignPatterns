package FactoryPattern.PizzaExample;

public class NyStyleVeggiePizza implements Pizza{
    @Override
    public void description() {
        System.out.println("This is Ny style veggie pizza");
    }
}
