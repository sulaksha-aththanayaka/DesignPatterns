package FactoryPattern.PizzaExample;

public class ChicagoStyleCheesePizza implements Pizza{
    @Override
    public void description() {
        System.out.println("This is Chicago style cheese pizza");
    }
}
