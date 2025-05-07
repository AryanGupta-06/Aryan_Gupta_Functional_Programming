package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.Optional;

public class Q20 {
    public static void main(String[] args) {
        // Example with a non-null value
        Optional<String> optionalValue = Optional.ofNullable(getValue());
        String value = optionalValue.orElse("default value");
        System.out.println("Value: " + value);

        // Example with a null value
        Optional<String> emptyOptional = Optional.ofNullable(null);
        String defaultValue = emptyOptional.orElse("default value");
        System.out.println("Default Value: " + defaultValue);
    }

    private static String getValue() {
        return "Hello, World!";
    }
}

