package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    public void draw(){
        shapeDecorator.draw();
        setBorder(shapeDecorator);
    }

    private void setBorder(Shape shapeDecorator){
        System.out.println("Border is red");
    }
}
