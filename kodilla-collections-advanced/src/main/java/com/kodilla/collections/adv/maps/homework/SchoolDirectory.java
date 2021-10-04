package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDetails = new HashMap<>();
        Principal pawel = new Principal("Pawel", "Kowalski");
        Principal tomasz = new Principal("Tomasz","Malcerek");
        Principal dominik = new Principal("Dominik", "Balcerek");

School american= new School("American", 23,32,23,12);
School british = new School("British", 23,12,10,4);
School international = new School("International", 23,10,11,22,11,21);

schoolDetails.put(pawel,american);
schoolDetails.put(tomasz, british);
schoolDetails.put(dominik,international);

     for(Map.Entry<Principal,School>principalSchoolEntry:schoolDetails.entrySet()){
         System.out.println("Total students in " + principalSchoolEntry.getKey().getPname() + " " + principalSchoolEntry.getKey().getPsurname() + "'s " + principalSchoolEntry.getValue().getSchoolName() +"  school : " +  principalSchoolEntry.getValue().getSum());
     }

    }
}



