package com.kodilla.exception.test;

import java.util.HashMap;

public class DataFlights {
    HashMap<String, Boolean> allFlights = new HashMap<>();

    public void addFlight(String airport, Boolean isItPossiblyToFly) {
        allFlights.put(airport,isItPossiblyToFly);
    }

    public HashMap<String, Boolean> getAllFlights() {
        return allFlights;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if(allFlights.containsKey(flight.getArrivalAirport())){
            System.out.println("Arrival to: " + flight.getArrivalAirport() + " is: " + allFlights.get(flight.getArrivalAirport()));
            return allFlights.get(flight.getArrivalAirport());
        }else{
            throw new RouteNotFoundException("Arrival to: " + flight.getArrivalAirport() + " is not found");
        }


    }
}
