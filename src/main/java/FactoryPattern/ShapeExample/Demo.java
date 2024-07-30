package FactoryPattern.ShapeExample;

public class Demo {
    public static void main(String[] args){
        ShapeCreator shapeCreator = new ShapeCreator();
        Shape circle = shapeCreator.createShape(new Circle());
        circle.draw();

        Shape rectangle = shapeCreator.createShape(new Rectangle());
        rectangle.draw();
    }
}
