package Java_Functional_Programming_Questions.Advanced_Optional_And_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q48 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");

        Optional<String> thirdElement = list.stream()
                .skip(2)
                .findFirst();

        thirdElement.ifPresentOrElse(
                element -> System.out.println("The third element is: " + element),
                () -> System.out.println("The list does not have a third element")
        );
    }
}

