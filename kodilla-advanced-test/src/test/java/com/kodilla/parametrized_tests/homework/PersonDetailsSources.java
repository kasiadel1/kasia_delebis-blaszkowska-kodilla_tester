package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_test.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDetailsSources {


    static Stream<Arguments> providePersonDetailsForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.6,60),"Normal (healthy weight)"),
               Arguments.of(new Person(1.76,200),"Obese Class VI (Hyper Obese)"),
               Arguments.of(new Person(1.76,76),"Normal (healthy weight)"),
                Arguments.of(new Person(2.00,230),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.70,80),"Overweight"),
                Arguments.of(new Person(1.56,45),"Underweight"),
                Arguments.of(new Person(1.62,54),"Normal (healthy weight)")

        );
    }

}