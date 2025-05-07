package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evenNumbers = partitionedNumbers.get(true);
        List<Integer> oddNumbers = partitionedNumbers.get(false);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

