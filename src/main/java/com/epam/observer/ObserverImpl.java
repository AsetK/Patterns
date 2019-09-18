package com.epam.observer;

import java.util.HashMap;

public class ObserverImpl implements Observer{
    private WeatherData weatherData;
    private double temperature;

    public ObserverImpl(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        this.display();
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "temperature=" + temperature +
                '}';
    }
}
