package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q15 {
    public static void main(String[] args) {
        // Example list of words
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Using streams to map words to their lengths and collect the results into a list
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // Print the lengths
        System.out.println("Words: " + words);
        System.out.println("Lengths: " + lengths);
    }
}


