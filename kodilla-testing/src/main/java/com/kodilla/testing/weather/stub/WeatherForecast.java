package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Tempratures tempratures;

    public WeatherForecast(Tempratures tempratures){
        this.tempratures = tempratures;
    }

    public HashMap<Integer, Double> calculateForecast(){
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for(Map.Entry<Integer,Double> temperature : tempratures.getTemperatures().entrySet()){
            //add 1 celsius to to current value
            //as a temporaty weather forecast
            resultMap.put(temperature.getKey(),temperature.getValue() + 1);
        }
        return resultMap;
    }
}
