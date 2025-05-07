package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.function.Function;

public class Q2 {
    public static void main(String[] args) {
        Function<String, Integer> stringLengthFunction = str -> str.length();

        // Example usage
        String example = "Hello, World!";
        int length = stringLengthFunction.apply(example);
        System.out.println("The length of the string is: " + length);
    }
}

