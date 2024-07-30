package FactoryPattern.PizzaExample;

public class Demo {
    public static void main(String[] args){
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.createPizza(new NyStyleCheesePizza());
        nyCheesePizza.description();

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoVeggiePizza = chicagoPizzaStore.createPizza(new ChicagoStyleVeggiePizza());
        chicagoVeggiePizza.description();
    }
}
