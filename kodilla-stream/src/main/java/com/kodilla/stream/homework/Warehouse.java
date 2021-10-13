package com.kodilla.stream.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    private static Set<Order> orders = new HashSet<>();

    public static Order addOrder(Order order){
        orders.add(order);
        System.out.println("Order " + order + " added.");
        return  order;
    }

    public static Order getOrder(String number) throws OrderDoesntExistException{
        System.out.println("Looking for order " + number);
        return orders
                .stream()
                .filter(un -> un.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }

}
