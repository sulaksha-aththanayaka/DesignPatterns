package DecoratorPattern;

public class Demo {
    public static void main(String[] args){
        Shape circle = new Circle();

        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());

        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());


        System.out.println("This is a normal circle");
        circle.draw();

        System.out.println("This is a red circle");
        redCircle.draw();

        System.out.println("This is a red rectangle");
        redRectangle.draw();
    }
}
