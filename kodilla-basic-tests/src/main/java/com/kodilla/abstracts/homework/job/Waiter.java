package com.kodilla.abstracts.homework.job;

public class Waiter extends Job{


    public Waiter(double salary, String responsibilities) {
        super(salary, responsibilities);

        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
