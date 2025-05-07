package Java_Functional_Programming_Questions.Level_3_Advanced_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q18 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        String result = list.stream().collect(Collectors.joining(", "));
        System.out.println(result); // Output: apple, banana, cherry
    }
}

