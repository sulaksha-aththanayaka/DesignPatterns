package DecoratorPattern.CoffeeExample;

public class Milk extends Condiment{
    public Milk(Beverage beverage){
        super(beverage);
    }

    @Override
    public void description() {
        beverage.description();
        addMilk();
    }

    public void addMilk(){
        System.out.println("Milk added");
    }

}
