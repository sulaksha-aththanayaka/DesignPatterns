package CommandPattern;

public class Television implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }

    public void ChangeChannel(){
        System.out.println("TV channel is changed");
    }
}
