package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use stream.map() to transform each element to double and store the result
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0) // Filter even numbers
                                                     .collect(Collectors.toList()); // Collect the filtered numbers into a new list

        // Print the filtered list
        System.out.println("Even Numbers: " + evenNumbers);

    }
}
