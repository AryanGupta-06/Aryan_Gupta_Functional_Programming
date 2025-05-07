package Java_Functional_Programming_Questions.Custom_Types_And_Nested_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q40 {
    public static void main(String[] args) {
        String csv = "1,2,3,4";
        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}

