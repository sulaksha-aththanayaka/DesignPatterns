package DecoratorPattern.CoffeeExample;

public class Demo {
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        System.out.println("1: Normal coffee");
        coffee.description();

        Milk milkCoffee = new Milk(coffee);
        System.out.println("2: Milk added coffee");
        milkCoffee.description();

        Sugar sugarMilkCoffee = new Sugar(milkCoffee);
        System.out.println("3: Sugar and milk added coffee");
        sugarMilkCoffee.description();
    }
}
