package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    public List<Observer> observers = new ArrayList<>();

    private float temperature;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(temperature);
        }
    }
}
