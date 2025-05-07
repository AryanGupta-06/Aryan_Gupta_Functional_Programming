package Java_Functional_Programming_Questions.Bonus_Real_Life_Mini_Challenges;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.logging.Logger;

public class Q52 {

    private static final Logger logger = Logger.getLogger(Q52.class.getName());

    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(item -> {
                    boolean result = predicate.test(item);
                    if (result) {
                        logger.info("Filtered item: " + item);
                    }
                    return result;
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example usage
        List<String> items = List.of("apple", "banana", "cherry", "date");
        Predicate<String> predicate = s -> s.startsWith("a");

        List<String> filteredItems = filterAndLog(items, predicate);
        System.out.println("Filtered items: " + filteredItems);
    }
}

