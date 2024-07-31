package CommandPattern;

public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is off");
    }

    public void AdjustVolume(){
        System.out.println("Stereo volume is adjusted");
    }
}
