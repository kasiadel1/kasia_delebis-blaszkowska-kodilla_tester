package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

  static List<Flight> flightsTable;

  public static List<Flight> getFlightsTable(){
     flightsTable = new ArrayList<>();
     flightsTable.add(new Flight("Gdańsk", "Aberdeen"));
     flightsTable.add(new Flight("Warsaw", "Frankfurt"));
     flightsTable.add(new Flight("Poznań", "Amsterdam"));
     flightsTable.add(new Flight("Warsaw", "Prague"));
     flightsTable.add(new Flight("Cracow","Hague"));
    // flightsTable.add(new Flight(" "," "));
     return flightsTable;
  }

}
