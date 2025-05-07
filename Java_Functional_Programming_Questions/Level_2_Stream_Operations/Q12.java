package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q12 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        Optional<String> longestString = strings.stream()
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);

        longestString.ifPresent(System.out::println);
    }
}

