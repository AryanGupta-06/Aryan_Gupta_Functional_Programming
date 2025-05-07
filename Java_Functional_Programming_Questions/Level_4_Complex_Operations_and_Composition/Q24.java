package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q24 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 5, 4, 1);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * 2)         // Map each number to its double
                .sorted()                // Sort the numbers
                .collect(Collectors.toList()); // Collect the result into a list

        System.out.println(result); // Output: [4, 8]
    }
}

