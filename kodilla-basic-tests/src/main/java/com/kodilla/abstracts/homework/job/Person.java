package com.kodilla.abstracts.homework.job;

public class Person {


    public String name;
    public int age;
    public String jobName;

    public Person(String name, int age, String jobName) {
        this.name = name;
        this.age = age;
        this.jobName = jobName;
    }

    public static void main(String[] args) {


        Cook cook = new Cook(4000, "Cooking, choping veggie , yelling at coworkers in the kichen");
        System.out.println("Cook  earns  about  " + cook.salary + " and for his responsibilites belong among others : " + cook.responsibilities);


        Manager manager = new Manager(8000," Listening to the clients complaints , controls waiters");
        System.out.println("Manager earns about " + manager.salary + " and for his responsibilites belong among others  : " + manager.responsibilities);

        Waiter waiter = new Waiter(3000," Taking orders, cleaning tables, entertaining clients");
        System.out.println("Waiter earns about " + waiter.salary + " and  for his responsibilites belong among others : " + manager.responsibilities);
    }

}
