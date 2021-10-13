package com.kodilla.stream.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));
        Warehouse.addOrder(new Order("4"));
        Warehouse.addOrder(new Order("6"));




        try {
            System.out.println(Warehouse.getOrder("2"));
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found.");
        }
    }
}