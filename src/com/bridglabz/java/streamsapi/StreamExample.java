package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(7, 3, 10, 4, 9, 6, 2, 15);

        // Find the sum of the numbers in the stream
        int sum = numbers.stream().mapToInt(Integer::intValue)  // Convert Integer to int
                                  .sum();  // Find the sum of the numbers


        // Find the average of the numbers in the stream
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue)  // Convert Integer to int
                                                 .average();  // Find the average of the numbers

        // Print the sum and average
        System.out.println("Sum: " + sum);
        average.ifPresent(avg -> System.out.println("Average: " + avg));

    }
}
