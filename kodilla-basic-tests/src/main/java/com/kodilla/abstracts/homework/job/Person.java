
package com.kodilla.abstracts.homework.job;

public class Person {

public String name;
public  Job job;
 public  int age;

    public Person(String name, Job job ,int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public static void main(String[] args) {
        Job waiter = new Waiter();
        Person anna = new Person("Anna", waiter, 23) ;

    }

}