package com.kodilla.collections.adv.excercises.homework;

import java.util.List;
import java.util.ArrayList;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                departureTable.add(flight);
            }
        }
        if (departureTable.size() == 0) {
            System.out.println("There are no flights from this airport");
        }
        return departureTable;
    }


    public static List<Flight> findFlightsTo(String arrival) {


    List<Flight> arrivalTable = new ArrayList<>();
    for(
    Flight flight :FlightRepository.getFlightsTable())

    {
        if (flight.getArrival().equals(arrival)) {
            arrivalTable.add(flight);
        }
    }
    if(arrivalTable.size()==0)

    {
        System.out.println("There are no flights to this airport");
    }
    return arrivalTable;


}
}

