package SinglePattern;

public class Demo {
    public static void main(String[] args){
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("X: " + x.s);
        System.out.println("Y: " + y.s);

        y.s = (y.s).toLowerCase();

        System.out.println("x: " + x.s);
        System.out.println("y: " + y.s);

    }
}
