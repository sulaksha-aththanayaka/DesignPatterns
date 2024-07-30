package DecoratorPattern.CoffeeExample;

public abstract class Condiment implements Beverage{
    Beverage beverage;

    public Condiment(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public void description() {
        beverage.description();
    }
}
