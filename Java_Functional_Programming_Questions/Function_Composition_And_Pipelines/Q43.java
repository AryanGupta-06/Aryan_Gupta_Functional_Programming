package Java_Functional_Programming_Questions.Function_Composition_And_Pipelines;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q43 {

    public static <T, R> List<R> applyFunctionToList(List<T> list, Function<T, R> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Function<Integer, String> intToString = Object::toString;

        List<String> stringNumbers = applyFunctionToList(numbers, intToString);
        stringNumbers.forEach(System.out::println);
    }
}
