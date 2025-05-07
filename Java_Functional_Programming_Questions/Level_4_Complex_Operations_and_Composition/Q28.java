package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q28 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> product = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .reduce((a, b) -> a * b); // Calculate the product
        if (product.isPresent()) {
            System.out.println("The product of all even numbers is: " + product.get());
        } else {
            System.out.println("There are no even numbers in the list.");
        }
    }
}

