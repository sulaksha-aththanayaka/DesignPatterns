package SinglePattern;

public class Singleton {
    public static Singleton singleton_instance = null;

    public String s;

    private Singleton(){
        s = "Hello I am a string part of the singleton class";
    }

    public static Singleton getInstance(){
        if (singleton_instance == null){
            singleton_instance = new Singleton();
        }

        return singleton_instance;
    }
}
