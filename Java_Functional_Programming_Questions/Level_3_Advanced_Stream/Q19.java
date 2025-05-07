package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 10, 14, 25, 30);

        Optional<Integer> firstDivisibleByFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().findFirst()
                ));

        firstDivisibleByFive.ifPresentOrElse(
                n -> System.out.println("The first element divisible by 5 is: " + n),
                () -> System.out.println("No element divisible by 5 found.")
        );
    }
}

