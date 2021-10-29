package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_test.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTestSuite{

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonDetailsSources#providePersonDetailsForTestingBMI")
    public void shouldCalculateBMIBasedOnAvaiableData(Person result, String expected)  {
        assertEquals(expected,result.getBMI());

    }


}






