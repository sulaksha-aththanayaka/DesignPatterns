package AbstractFactoryPattern.CarManufacturingExample;

public class HatchBack implements Car{
    @Override
    public void assemble() {
        System.out.println("Hatchback car assembled");
    }
}
