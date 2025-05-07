package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}

