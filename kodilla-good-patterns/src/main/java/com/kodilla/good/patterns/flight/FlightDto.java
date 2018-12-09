package com.kodilla.good.patterns.flight;

public class FlightDto {
    public Flight flight1;
    public Flight flight2;

    public FlightDto(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    @Override
    public String toString() {
        return "FlightDto{" +
                "flight1=" + flight1 +
                ", flight2=" + flight2 +
                '}';
    }
}
