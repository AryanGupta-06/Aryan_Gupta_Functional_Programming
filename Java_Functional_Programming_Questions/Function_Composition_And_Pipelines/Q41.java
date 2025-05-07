package Java_Functional_Programming_Questions.Function_Composition_And_Pipelines;

import java.util.function.Function;

public class Q41 {

    public static void main(String[] args) {
        String input = "   Hello, World! This is a Test. ";

        // Create the pipeline
        Function<String, String> pipeline = trim().andThen(lowercase()).andThen(removePunctuation());

        // Process the input string
        String result = pipeline.apply(input);

        // Print the result
        System.out.println(result);
    }

    // Function to trim the string
    public static Function<String, String> trim() {
        return str -> str.trim();
    }

    // Function to convert the string to lowercase
    public static Function<String, String> lowercase() {
        return str -> str.toLowerCase();
    }

    // Function to remove punctuation from the string
    public static Function<String, String> removePunctuation() {
        return str -> str.replaceAll("\\p{Punct}", "");
    }
}
