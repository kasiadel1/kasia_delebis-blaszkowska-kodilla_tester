package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }
        @Test
        public void testSubstract () {
            Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int substractResult = calculator.substract(a, b);
            assertEquals(-3, substractResult);
        }
// przyd 1 d> 0
           @Test
            public void testSquare1 () {
                Calculator calculator = new Calculator();
                double d = 5;
                double square1Result = calculator.squared1(d);
                assertEquals(25, square1Result, 0.02);

            }

// przyp 2 d<0

    @Test
    public void testSquare2 () {
        Calculator calculator = new Calculator();
        double d = -5;
        double square1Result = calculator.squared1(d);
        assertEquals(25, square1Result, 0.02);

    }


    //przyp 3 d=0

    @Test
    public void testSquare3 () {
        Calculator calculator = new Calculator();
        double d = 0;
        double square1Result = calculator.squared1(d);
        assertEquals(0, square1Result, 0.02);

    }

        }

