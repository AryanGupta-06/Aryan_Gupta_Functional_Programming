package Java_Functional_Programming_Questions.Data_Processing_And_Transformations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q33 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(8, 9, 10)
        );

        List<Integer> distinctEvenNumbers = listOfLists.stream()
                .flatMap(List::stream) // Flatten the list of lists
                .filter(num -> num % 2 == 0) // Filter even numbers
                .distinct() // Get distinct numbers
                .collect(Collectors.toList()); // Collect to list

        System.out.println(distinctEvenNumbers);
    }
}

