package com.kodilla.execution_model.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class ShopTestSuite {


 Shop shop = new Shop();
 Order no1 = new Order(1980, LocalDate.of(2020, 10, 18), "tom");
 Order no2 = new Order(672, LocalDate.of(2021, 11, 01), "alexa");
 Order no3 = new Order(800, LocalDate.of(2021, 05, 23), "cristiano");
 Order no4 = new Order(129, LocalDate.of(2018, 07, 13), "amelie");
 Order no5 = new Order(320, LocalDate.of(2019, 03, 19), "alexa");
 Order no6 = new Order(410, LocalDate.of(2021, 05, 23), "john");


 @Test
 public void shouldGetNumbersOfOrders() {
  int numberOfOrders = shop.getSize();
  assertEquals(6, numberOfOrders);
 }

 @Test
 public void shouldReturnEmptyListOfOrdersIfNoOrdersBetweenTwoDates() {
  List<Order> emptyList = shop.returnOrdersBetweenTwoDates(LocalDate.of(2017, 01, 01), LocalDate.of(2017, 01, 20));
  assertEquals(Collections.emptyList(), emptyList);
 }

 @Test
 public void shouldGetSumOfOrders(){
  int result = shop.getSumOfOrders();
  assertEquals(4311,shop.getSumOfOrders());

 }

 @Test //ten test sie wywala z komunikatem expected: <129> but was: <OptionalInt[129]>
 public void shouldGetOrderWithMinValue(){
  OptionalInt result = shop.getOrderWithMinValue();
  assertEquals("129",shop.getOrderWithMinValue());
 }


 @Test
 public void shouldReturnListOfOrdersBetweenTwoDates() {
  List<Order> resultList = shop.returnOrdersBetweenTwoDates(LocalDate.of(2018, 01, 01), LocalDate.of(2018, 12, 31));
  assertEquals(1, resultList.size());
 }



@Test
public void shouldReturnListOfOrdersWithinValueRange(){
  List<Order>resultList =shop.getOrdersWithinValueRange(100,500);
  assertEquals(3,resultList.size());
}


 @BeforeEach
 public void initializeShop() {
  shop.addOrder(no1);
  shop.addOrder(no2);
  shop.addOrder(no3);
  shop.addOrder(no4);
  shop.addOrder(no5);
  shop.addOrder(no6);

 }
}