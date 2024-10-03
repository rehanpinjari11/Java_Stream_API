package com.bridglabz.java.streamsapi;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args)
    {
        //Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Create a stream from the list and use forEach to iterate over the elements
        numbers.stream().forEach(number -> System.out.println("Number " + number));


    }
}
