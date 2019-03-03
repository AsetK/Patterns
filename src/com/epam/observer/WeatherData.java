package com.epam.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Observable{
    private List<Observer> observers = new LinkedList<>();
    private double temperature;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.temperature);
        }
    }

    public void setMeasurements(double temperature){
        this.temperature = temperature;
        this.notifyObservers();
    }
}
