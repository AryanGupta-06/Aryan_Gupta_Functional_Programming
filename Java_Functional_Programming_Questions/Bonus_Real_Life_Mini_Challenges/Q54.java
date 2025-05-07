package Java_Functional_Programming_Questions.Bonus_Real_Life_Mini_Challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q54 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        List<String> top3LongestStrings = strings.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 longest strings: " + top3LongestStrings);
    }
}
