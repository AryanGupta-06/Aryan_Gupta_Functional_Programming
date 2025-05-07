package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.List;
import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        double averageLength = calculateAverageLength(strings);
        System.out.println("Average length of strings: " + averageLength);
    }

    public static double calculateAverageLength(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return 0;
        }

        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }

        return (double) totalLength / strings.size();
    }
}

