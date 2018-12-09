package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindRoute {
    List<Flight> findFlight;

    public void putData(final List<Flight> findFlight) {
        this.findFlight = findFlight;
    }

    public List<Flight> findFrom(String departureAirport) {

        List<Flight> departureList = findFlight.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
        return new ArrayList<>(departureList);
    }

    public List<Flight> findTo(String arrivalAirport) {

        List<Flight> arrivalList = findFlight.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        return new ArrayList<>(arrivalList);
    }

    public List<FlightDto> findFromToBy(String departureAirport, String arrivalAirport) {

        List<FlightDto> fromToByList = new ArrayList<>();

       for (Flight f : findFrom(departureAirport)) {
            for (Flight f2: findTo(arrivalAirport)) {
                if(f.getArrivalAirport().equals(f2.getDepartureAirport())) {
                    fromToByList.add(new FlightDto(f,f2));
                }
            }
        }
        return new ArrayList<>(fromToByList);
    }
}
