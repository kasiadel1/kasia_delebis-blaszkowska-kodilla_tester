package com.kodilla.stream.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WarehouseTest {

   private Warehouse warehouse = new Warehouse();

   @Test
   public void checkIfOrderExists() throws OrderDoesntExistException {
      warehouse.addOrder(new Order("7"));
      Order result = warehouse.getOrder("7");
      assertEquals("7", result.getNumber());
   }


}
