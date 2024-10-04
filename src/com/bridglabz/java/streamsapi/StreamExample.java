package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(7, 3, 10, 4, 9, 6, 2, 15);

        // Sort the number stream in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted() // Sort in ascending order by default
                                             .collect(Collectors.toList()); // Collect into a list


        // Print the sorted list
        System.out.println("Sorted Numbers in Ascending Order: " + sortedNumbers);

    }
}
