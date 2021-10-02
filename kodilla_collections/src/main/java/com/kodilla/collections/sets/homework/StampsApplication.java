package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Irys",5.0, true));
        stamps.add(new Stamp("Róża", 3.0, false));
        stamps.add(new Stamp("Fiolek", 2.0, false));
        stamps.add(new Stamp("Gerber",6.0,true ));
        stamps.add(new Stamp("Gerber",6.0,true ));
        stamps.add(new Stamp("Gerber",6.0,true ));
        stamps.add(new Stamp("Gerber",6.0,true ));
        stamps.add(new Stamp("Gerber",6.0,true ));

        System.out.println(stamps.size());
for (Stamp stamp : stamps){
    System.out.println(stamp);
}
    }
}
