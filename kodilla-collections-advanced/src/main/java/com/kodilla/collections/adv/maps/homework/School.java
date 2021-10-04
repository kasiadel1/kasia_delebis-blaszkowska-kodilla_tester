package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {


    private String schoolName;
    private List<Integer> numberOfStudents;

    public School(String schoolName, int... numberOfStudents) {
        this.schoolName = schoolName;
        this.numberOfStudents = new ArrayList<>();


        for (int number : numberOfStudents) {
            this.numberOfStudents.add(number);

        }
    }

    public int getSum() {
        int sum = 0;
        for (int number : numberOfStudents)
            sum += number;
        return sum;

    }

    public String getSchoolName(){
        return schoolName;
    }

}