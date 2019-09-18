package com.epam.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ObserverImpl observer1 = new ObserverImpl(weatherData);
        ObserverImpl observer2 = new ObserverImpl(weatherData);

        weatherData.setMeasurements(20);
        weatherData.setMeasurements(30);
        weatherData.setMeasurements(40);

    }
}
