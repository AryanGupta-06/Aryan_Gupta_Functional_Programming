package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.Optional;
import java.util.function.Function;

public class Q23 {

    // Function to convert a string to uppercase using a lambda expression
    public static Function<String, String> toUpperCase = input ->
            Optional.ofNullable(input).map(String::toUpperCase).orElse(null);

    // Function to append an exclamation mark to a string using a lambda expression
    public static Function<String, String> appendExclamation = input ->
            Optional.ofNullable(input).map(str -> str + "!").orElse(null);

    public static void main(String[] args) {
        String original = "hello world";

        // Convert to uppercase
        String upperCaseString = toUpperCase.apply(original);
        System.out.println("Uppercase: " + upperCaseString);

        // Append exclamation mark
        String exclaimedString = appendExclamation.apply(original);
        System.out.println("Exclaimed: " + exclaimedString);
    }
}
