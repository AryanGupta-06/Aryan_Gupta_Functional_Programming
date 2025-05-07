package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q14 {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the list of integers to a list of their squares using map and collect
        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        // Print the list of squares
        System.out.println("Original list: " + numbers);
        System.out.println("List of squares: " + squares);
    }
}

