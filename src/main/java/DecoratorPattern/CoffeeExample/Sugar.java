package DecoratorPattern.CoffeeExample;

public class Sugar extends Condiment{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void description() {
        beverage.description();
        addSugar();
    }

    public void addSugar(){
        System.out.println("Sugar added");
    }
}
