package TemplatePattern;

public class Demo {
    public static void main(String[] args){
        TeaMaker teaMaker = new TeaMaker();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.println("Let's make a tea");
        teaMaker.makeBeverage();

        System.out.println("Let's make a coffee");
        coffeeMaker.makeBeverage();
    }
}
