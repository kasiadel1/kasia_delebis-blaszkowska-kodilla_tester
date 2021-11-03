package com.kodilla.stream.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class WarehouseTest {


   private Warehouse warehouse = new Warehouse();

   @Test
   public void checkIfOrderExists() throws OrderDoesntExistException {
      warehouse.addOrder(new Order("7"));
      Order result = warehouse.getOrder("7");
   }


   @Test
   public void testIfOrderExists_withException(){
      warehouse.addOrder(new Order("9"));
      assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("99"));
   }
}



