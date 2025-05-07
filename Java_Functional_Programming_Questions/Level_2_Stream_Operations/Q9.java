package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "stream");

        // Convert the list of strings to uppercase using map()
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        upperCaseStrings.forEach(System.out::println);
    }
}

