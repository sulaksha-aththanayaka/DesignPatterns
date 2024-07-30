package DecoratorPattern.CoffeeExample;

public class Coffee implements Beverage{
    @Override
    public void description() {
        System.out.println("This is a coffee");
    }
}
