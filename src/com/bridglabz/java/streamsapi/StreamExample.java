package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use stream.map() to transform each element to double and store the result
        List<Double> doubleNumbers = numbers.stream().map(number -> number * 2.0) //Transform each element to double
                                                     .collect(Collectors.toList()); // Collect the result into a new list

        //Print the transformed list
        doubleNumbers.forEach(doubleNumber -> System.out.println("Double Number " + doubleNumber));


    }
}
