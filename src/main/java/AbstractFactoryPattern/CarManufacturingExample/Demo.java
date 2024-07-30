package AbstractFactoryPattern.CarManufacturingExample;

public class Demo {
    public static void main(String[] args){
        CarFactory northAmericanFactory = new NorthAmericaFactory();
        Car northAmericanCar = northAmericanFactory.createCar();
        Specification northAmericanSpecification = northAmericanFactory.createSpecification();
        northAmericanCar.assemble();
        northAmericanSpecification.display();

        CarFactory europeFactory = new EuropeFactory();
        Car europeCar = europeFactory.createCar();
        Specification europeSpecification = europeFactory.createSpecification();
        europeCar.assemble();
        europeSpecification.display();
    }
}
