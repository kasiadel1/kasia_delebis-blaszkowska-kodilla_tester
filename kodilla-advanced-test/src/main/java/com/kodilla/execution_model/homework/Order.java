package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
   int value;
   LocalDate date;
   String login;

    public Order(int value,LocalDate date,String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }


    public int getValue(){
        return value;
    }

    public LocalDate getDate(){
        return date;
    }

public String getLogin(){
        return login;
}

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

}
