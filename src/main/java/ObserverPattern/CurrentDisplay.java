package ObserverPattern;

public class CurrentDisplay implements Observer{
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("This is the temperature in current display: " + temperature);
    }
}
