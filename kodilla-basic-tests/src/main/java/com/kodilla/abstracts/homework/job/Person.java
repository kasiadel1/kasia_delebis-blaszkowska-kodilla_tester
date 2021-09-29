
package com.kodilla.abstracts.homework.job;

public class Person {

   public String name;
   public int age;
   private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person Anna = new Person("Anna", 23,Waiter) ;


    }

}