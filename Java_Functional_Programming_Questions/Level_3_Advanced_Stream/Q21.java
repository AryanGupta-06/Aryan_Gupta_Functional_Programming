package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q21 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3);

        // Convert the list to a set using Collectors.toSet()
        Set<Integer> integerSet = integerList.stream()
                .collect(Collectors.toSet());

        // Print the set
        System.out.println("Set: " + integerSet);
    }
}

