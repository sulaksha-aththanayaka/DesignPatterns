package AbstractFactoryPattern.CarManufacturingExample;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Sedan car assembled");
    }
}
