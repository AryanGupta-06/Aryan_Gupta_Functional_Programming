package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.List;
import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Sam", "Steve", "Alice", "Bob", "Sophie", "John");

        long count = strings.stream()
                .filter(s -> s.startsWith("S"))
                .count();

        System.out.println("Number of strings starting with 'S': " + count);
    }
}

