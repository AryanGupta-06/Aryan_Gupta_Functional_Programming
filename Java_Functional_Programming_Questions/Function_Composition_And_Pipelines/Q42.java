package Java_Functional_Programming_Questions.Function_Composition_And_Pipelines;

import java.util.function.Function;

public class Q42 {

    // Function to parse a string to an integer
    public static Function<String, Integer> parseStringToInt = str -> {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input string: " + str);
            return 0; // or handle it as per your requirement
        }
    };

    // Function to double an integer
    public static Function<Integer, Integer> doubleNumber = num -> num * 2;

    public static void main(String[] args) {
        // Example usage
        String inputString = "123";

        // Composing functions
        Function<String, Integer> parseAndDouble = parseStringToInt.andThen(doubleNumber);

        // Applying the composed function
        int result = parseAndDouble.apply(inputString);

        System.out.println("Result: " + result);
    }
}

