package AbstractFactoryPattern.CarManufacturingExample;

public interface CarFactory {
    Car createCar();
    Specification createSpecification();
}
