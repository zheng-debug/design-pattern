package com.design.designpattern.observerPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentSumDisplay currentSumDisplay = new CurrentSumDisplay(weatherData);
        CurrentMultiplyDisplay currentMultiplyDisplay = new CurrentMultiplyDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);
    }
}
