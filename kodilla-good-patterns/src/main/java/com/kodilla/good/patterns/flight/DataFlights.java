package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataFlights {
    private final List<Flight> allFlights = new ArrayList<>();

    public boolean addFlight(Flight flight) {
        allFlights.add(flight);
        return true;
    }


    public List<Flight> getAllFlights() {
        return new ArrayList<>(allFlights);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataFlights that = (DataFlights) o;
        return Objects.equals(allFlights, that.allFlights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allFlights);
    }
}
