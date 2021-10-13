package com.kodilla.collections.adv.excercises.homework;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FlightFinderTests {


    @Test
    public void testShowsResultWhenArrivalIsEmptyString() {

        FlightFinder flight = new FlightFinder();
        assertEquals(1, flight.findFlightsTo(" ").size());
    }

    @Test
    public void testShowsNoResultWhenArrivalIsEmptyString() {

            FlightFinder flight = new FlightFinder();
            assertEquals(0, flight.findFlightsTo(" ").size());
        }

    @Test
    public void testFindFlightsFromWarsaw() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsFrom("Warsaw");
        //then
        assertNotEquals(0, foundFlights.size());
        assertNotEquals(1, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("Warsaw", flight.departure);
        }
    }



    @Test
    public void testFindFlightsToFrankfurt() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("Frankfurt");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("Frankfurt", flight.arrival);
        }
    }

    @Test
    public void testShowsNoResultWhenThereIsNoFlightTo() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo("LA").size());
    }

    @Test
    public void testIfShowsNoResultWhenThereIsNoFlightFrom() {

        FlightFinder flight = new FlightFinder();
        assertEquals(flight.findFlightsFrom("Luanda").size(),0);
    }


    @Test
    public void testIfShowsNoResultsWhenAirportToIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo(null).size());
    }

    @Test
    public void testIfShowsNoResultsWhenAirportTFromIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals( flight.findFlightsFrom(null).size(),0);
    }
}



