package ObserverPattern;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setTemperature(20.0f);
    }
}
