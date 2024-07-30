package AbstractFactoryPattern.CarManufacturingExample;

public class NorthAmericaFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public Specification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
