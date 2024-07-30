package FactoryPattern.PizzaExample;

public class ChicagoStyleVeggiePizza implements Pizza{
    @Override
    public void description() {
        System.out.println("This is Chicago style veggie pizza");
    }
}
