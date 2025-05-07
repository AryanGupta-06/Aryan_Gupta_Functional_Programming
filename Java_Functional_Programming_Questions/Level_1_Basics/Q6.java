package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.function.BiFunction;

public class Q6 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        // Example usage
        int result = sum.apply(5, 10);
        System.out.println("The sum is: " + result); // Output: The sum is: 15
    }
}

