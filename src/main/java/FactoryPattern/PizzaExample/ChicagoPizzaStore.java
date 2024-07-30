package FactoryPattern.PizzaExample;

public class ChicagoPizzaStore implements  PizzaStore{
    @Override
    public Pizza createPizza(Pizza pizza) {
        System.out.println("Created from Chicago pizza store");
        return pizza;
    }
}
