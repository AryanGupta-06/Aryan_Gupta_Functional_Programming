package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.function.Supplier;
import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt();

        // Example usage
        System.out.println(randomSupplier.get());
    }
}

