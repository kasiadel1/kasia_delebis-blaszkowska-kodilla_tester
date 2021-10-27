package com.kodilla.parametrized_test;

public class StringManipulator {

    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLenghtWithoutSpaces(String input){
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}