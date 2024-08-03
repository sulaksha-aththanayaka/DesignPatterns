package ProxyPattern;

public class Demo {
    public static void main(String[] args){
        RealImage image = new RealImage("example.jpg");

        image.display();

        image.display();
    }
}
