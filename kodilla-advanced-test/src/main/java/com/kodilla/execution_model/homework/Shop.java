package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Shop {


    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){

        this.orders.add(order);
    }


    public Order getOrder(int index){
        if (index >= 0 && index < orders.size()){
            return this.orders.get(index);
        }
        return null;
    }

    public int getSize(){
        return this.orders.size();
    }


    public int getSumOfOrders(){
    return orders.stream()
              .map(u -> u.getValue())
              .mapToInt(u->u)
              .sum();
    }

    public List<Order> getOrdersWithinValueRange(int valueX, int valueY) {
        return orders.stream()
                .filter(order -> order.getValue() >= valueX && order.getValue() <= valueY)
                .collect(Collectors.toList());
    }


    public OptionalInt getOrderWithMinValue(){
        return orders.stream()
                .map(u -> u.getValue())
                .mapToInt(u->u)
                .min();

    }

    public List<Order> returnOrdersBetweenTwoDates(LocalDate dateX, LocalDate dateY) {
        return orders.stream()
                .filter(u -> u.getDate().isAfter(dateX) && u.getDate().isBefore(dateY))
                .collect(Collectors.toList());
    }




}


