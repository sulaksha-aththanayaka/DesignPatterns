package FactoryPattern.ShapeExample;

public class ShapeCreator {
    // Factory method
    public Shape createShape(Shape shape){
        System.out.println("The shape is created");
        return shape;
    }
}
