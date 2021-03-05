package com.patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverImplTest {

    @Test
    public void test() {
        assert true;
    }

    @Test
    public void test2() {
        WeatherData weatherData = new WeatherData();
        ObserverImpl observer1 = new ObserverImpl(weatherData);
        ObserverImpl observer2 = new ObserverImpl(weatherData);

        weatherData.setMeasurements(20);
        weatherData.setMeasurements(30);
        weatherData.setMeasurements(40);
    }

}