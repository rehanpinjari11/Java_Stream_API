package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 7, 8, 10, 11, 12);

        // Use stream.filter() to find even numbers, and findFirst() to get the first even number
        Optional<Integer> firstEven = numbers.stream().filter(number -> number % 2 == 0) // Filter even numbers
                                                     .findFirst(); // Get the First Even Number

        // Print the first even number if present
        firstEven.ifPresent(number -> System.out.println("First Even Number: " + number));

    }
}
