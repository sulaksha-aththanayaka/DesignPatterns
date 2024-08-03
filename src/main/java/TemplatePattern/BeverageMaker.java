package TemplatePattern;
abstract class BeverageMaker {
    public final void makeBeverage(){
        boil();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boil(){
        System.out.println("Water is boiled");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
