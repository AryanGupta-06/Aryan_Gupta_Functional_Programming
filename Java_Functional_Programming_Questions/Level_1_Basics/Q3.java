package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.function.Consumer;

public class Q3 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        // Example usage
        printUpperCase.accept("hello world");
    }
}

