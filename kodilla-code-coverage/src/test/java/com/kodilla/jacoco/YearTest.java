package com.kodilla.jacoco;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class YearTest {

    @Test
     void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        Year year = new Year(1404);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
  void shouldnotBeLeapYearIfNotDivisibleByEither100or4() {
        Year year = new Year(1679);
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        Year year = new Year(2200);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}