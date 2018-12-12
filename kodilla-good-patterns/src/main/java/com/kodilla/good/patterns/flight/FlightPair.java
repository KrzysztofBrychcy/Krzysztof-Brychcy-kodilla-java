package com.kodilla.good.patterns.flight;

import java.util.Objects;

public class FlightPair {
    public Flight flightFrom;
    public Flight flightTo;

    public FlightPair(Flight flightFrom, Flight flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public Flight getFlightFrom() {
        return flightFrom;
    }

    public Flight getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "FlightPair{" +
                "flightFrom=" + flightFrom +
                ", flightTo=" + flightTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightPair that = (FlightPair) o;
        return Objects.equals(flightFrom, that.flightFrom) &&
                Objects.equals(flightTo, that.flightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo);
    }
}
