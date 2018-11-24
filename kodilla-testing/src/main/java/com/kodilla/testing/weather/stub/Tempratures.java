package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Tempratures {

    //first element of the map is an identifer of weather station
    //secend elemnt of the map is a temperature in Celsius degree

    HashMap<Integer, Double> getTemperatures();
}
