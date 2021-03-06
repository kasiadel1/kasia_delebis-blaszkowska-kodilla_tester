package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_test.StringValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty(){
        assertFalse(validator.isBlank("test"));
    }

    //Mozna te dwa zastapic jednym
   // @Test
   // public void shouldReturnTrueIfStringIsEmpty(){
    //    assertTrue(validator.isBlank(""));
    //}

    //@Test
   // public void shouldReturnTrueIfStringIsNull(){
   //     assertTrue(validator.isBlank("  "));
   // }

/*    @Test
    @ValueSource(strings ={"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text){
        assertTrue(validator.isBlank(text));
    }*/

    //aby null przekazac jako string trzeba zastosowac @NullSource
    /*
    @Test
    public void shouldReturnTrueIfStringIsNull(){
        assertTrue(validator.isBlank(null));
    }*/

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(validator.isBlank(text));
    }

    //pusty string
/*    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text){
        assertTrue(validator.isBlank(text));
    }*/

    //mozna to polaczyc w jeden test
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text){
        //zeby sprawdzic jakie wartosci przekazuje dana printujemy je w konsolce
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

}
