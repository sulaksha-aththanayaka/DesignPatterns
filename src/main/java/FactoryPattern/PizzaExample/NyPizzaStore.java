package FactoryPattern.PizzaExample;

public class NyPizzaStore implements  PizzaStore{
    @Override
    public Pizza createPizza(Pizza pizza) {
        System.out.println("Created from Ny pizza store");
        return pizza;
    }
}
