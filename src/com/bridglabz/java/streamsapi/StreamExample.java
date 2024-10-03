package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(7, 3, 10, 4, 9, 6, 2, 15);

        // Use stream.filter() to find even numbers, and findFirst() to get the first even number
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0) // Filter even numbers
                                                     .collect(Collectors.toList()); // Collect into List

        // Print the filtered even numbers
        System.out.println("Even Numbers: " + numbers);

        // Find the minimum and maximum even numbers
        Optional<Integer> minEven = evenNumbers.stream().min(Comparator.naturalOrder()); // Find the minimum even Number

        Optional<Integer> maxEven = evenNumbers.stream().max(Comparator.naturalOrder()); // Find the maximum even Number

        // Print the minimum and maximum even numbers if present

        minEven.ifPresent(min -> System.out.println("Minimum Even Number: " + min));
        maxEven.ifPresent(max -> System.out.println("Maximum Even Number: " + max));

    }
}
