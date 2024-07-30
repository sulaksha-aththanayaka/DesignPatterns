package AbstractFactoryPattern.CarManufacturingExample;

public class EuropeFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public Specification createSpecification() {
        return new EuropeSpecification();
    }
}
