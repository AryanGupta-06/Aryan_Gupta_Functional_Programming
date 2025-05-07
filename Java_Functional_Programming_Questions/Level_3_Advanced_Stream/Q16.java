package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Q16 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aryan", "Ankita", "Abhishek", "Rajesh", "Aman", "Brandon");

        // Group names by their first letter
        Map<Character, List<String>> groupedNames = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        // Print the grouped names
        groupedNames.forEach((letter, nameList) -> {
            System.out.println(letter + ": " + nameList);
        });

        // Example of using Optional with streams
        Optional<String> firstNameStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        firstNameStartingWithA.ifPresent(name -> System.out.println("First name starting with A: " + name));
    }
}

