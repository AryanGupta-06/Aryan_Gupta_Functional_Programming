package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.function.Predicate;

public class Q1 {
    public static void main(String[] args) {
        Predicate<String> startsWithA = str -> str.startsWith("A");

        // Test the predicate
        System.out.println(startsWithA.test("Apple")); // true
        System.out.println(startsWithA.test("Banana")); // false
    }
}

