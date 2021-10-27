package com.kodilla.collections.adv.excercises.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTests {



    @Test
    public void testShowsResultWhenThereIsFlight() {

        FlightFinder flight = new FlightFinder();
        assertEquals(flight.findFlightsFrom("Warsaw").size(),1);
    }


    @Test
    public void testShowsResultWhenThereIsFlightTo() {

        FlightFinder flight = new FlightFinder();
        assertEquals(1, flight.findFlightsTo("Frankfurt").size());
    }

    @Test
    public void testShowsNoResultWhenThereIsNoFlightTo() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo("LA").size());
    }

    @Test
    public void testShowsNoResultWhenThereIsNoFlightFrom() {

        FlightFinder flight = new FlightFinder();
        assertEquals(flight.findFlightsFrom("Luanda").size(),0);
    }

}



