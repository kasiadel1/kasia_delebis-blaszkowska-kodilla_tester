package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_test.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();


    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka_", "Krystyna12.-", "fRAnKo_22", "-hElA16_"})
    public void shouldReturnTrueIfUsernameHasOnlyPermittedChar(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka!!@", "Krystyna12!-", "fR()", "-@&",})
    public void shouldReturnFalseIfUsedCharAreForbidden(String username) {
        assertFalse(validator.validateUsername(username));
    }


    @ParameterizedTest
    @ValueSource(strings = {"ka", "w", "rr", ""})
    public void shouldReturnFalseIfUserNameIsUnderThreeChar(String username) {
        assertFalse(validator.validateUsername(username));
    }


    @ParameterizedTest
    @ValueSource(strings = {"kjuioljdss@yahoo.comacoma"})
    public void shouldReturnFalseIfDomainIsOverSixChar(String email) {
        assertFalse(validator.validateEmail(email));
    }


    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailNull(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kasia%0@Yahoo.com1", "Kate%&@gmail1,com", "Hel&&@gmail,pl", "Franko)3@vp.pl"})
    public void shouldReturnFalseIfUsedCharAreForbiddenInEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kasia_99@yahoo.com","-Hel221.Blake@9w.com","KRISS_K@BlAk-.com" })
    public void shouldReturnTrueIfPermittedCharAreUsedInEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

}