package com.kodilla.abstracts.homework.job;

public class Manager  extends Job{
    public Manager(double salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
