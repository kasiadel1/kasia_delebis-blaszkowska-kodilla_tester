package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String pname;
    private String psurname;


    public Principal(String pname, String psurname) {
        this.pname = pname;
        this.psurname = psurname;
    }

    public String getPname() {
        return pname;
    }

    public String getPsurname() {
        return psurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(pname, principal.pname) && Objects.equals(psurname, principal.psurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pname, psurname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "pname='" + pname + '\'' +
                ", psurname='" + psurname + '\'' +
                '}';
    }
}
