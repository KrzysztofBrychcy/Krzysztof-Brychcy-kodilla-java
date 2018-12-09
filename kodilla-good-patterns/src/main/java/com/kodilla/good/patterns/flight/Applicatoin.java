package com.kodilla.good.patterns.flight;

import java.time.LocalDateTime;

public class Applicatoin {
    public static void main(String args[]) {

        Flight flight1 = new Flight("Poznań", "Rzeszów");
        Flight flight2 = new Flight("Gdańsk", "Poznań");
        Flight flight3 = new Flight("Gdańsk", "Wrocław");
        Flight flight4 = new Flight("Poznań", "Warszawa");
        Flight flight5 = new Flight("Rzeszów","Warszawa");
        Flight flight6 = new Flight("Wrocław", "Rzeszów");

        DataFlights flights = new DataFlights();
        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addFlight(flight3);
        flights.addFlight(flight4);
        flights.addFlight(flight5);
        flights.addFlight(flight6);

        FindRoute findRoute = new FindRoute();
        findRoute.putData(flights.getAllFlights());


        System.out.println(findRoute.findFrom("Poznań"));
        System.out.println(findRoute.findTo("Warszawa"));
        System.out.println(findRoute.findFromToBy("Gdańsk","Rzeszów"));



    }
}
