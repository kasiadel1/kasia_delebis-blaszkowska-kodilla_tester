package com.kodilla.abstracts.homework.job;

public class Cook extends Job {


    public Cook(double salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
