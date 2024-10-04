package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(7, 3, 10, 4, 9, 6, 2, 15);

        // Check if all numbers are even using allMatch
        boolean allEven = numbers.stream()
                .allMatch(number -> number % 2 == 0); // Check if all numbers are even


        // Check if at least one number is even using anyMatch
        boolean anyEven = numbers.stream()
                .anyMatch(number -> number % 2 == 0); // Check if any number is even

        // Print the results
        System.out.println("Are all numbers even? " + allEven);
        System.out.println("Is there at least one even number? " + anyEven);

    }
}
