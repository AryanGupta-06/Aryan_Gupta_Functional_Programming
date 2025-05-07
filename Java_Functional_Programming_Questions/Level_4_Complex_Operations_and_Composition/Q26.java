package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.*;

public class Q26 {
    public static void main(String[] args) {
        // Example list of words
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        // Remove duplicates using a HashSet
        Set<String> uniqueWords = new HashSet<>(words);

        // Convert the set back to a list
        List<String> sortedWords = new ArrayList<>(uniqueWords);

        // Sort the list
        Collections.sort(sortedWords);

        // Print the sorted list
        System.out.println(sortedWords);
    }
}
