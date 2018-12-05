package com.kodilla.exception.test;

public class LetsFlyTo {
    public static void main(String args[]){
       DataFlights dataFlights = new DataFlights();
       dataFlights.addFlight("Poznan", true);
       dataFlights.addFlight("Rzeszow",true);
       dataFlights.addFlight("Warszawa",false);

       Flight myFlight = new Flight("Poznan","Rzeszow");

       try {
           dataFlights.findFlight(myFlight);
       }catch(RouteNotFoundException e){
           System.out.println("Flight to: " + myFlight.getArrivalAirport() +  ": not found");
       }

       myFlight = new Flight("Rzeszow","Katowice");

       try {
           dataFlights.findFlight(myFlight);
       }catch(RouteNotFoundException e){
           System.out.println("Flight to: " + myFlight.getArrivalAirport() +  ": not found");
       }
    }
}
