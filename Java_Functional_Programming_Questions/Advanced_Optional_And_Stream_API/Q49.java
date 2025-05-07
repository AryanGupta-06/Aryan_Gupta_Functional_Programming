package Java_Functional_Programming_Questions.Advanced_Optional_And_Stream_API;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q49 {

    public static void main(String[] args) {
        List<String> urls = List.of(
                "https://www.example.com",
                "invalid-url",
                "http://www.test.com",
                "ftp://fileserver.com",
                "https://anotherexample.com"
        );

        Predicate<String> isValidURL = url -> {
            try {
                new URL(url);
                return true;
            } catch (MalformedURLException e) {
                return false;
            }
        };

        List<String> validURLs = urls.stream()
                .filter(isValidURL)
                .collect(Collectors.toList());

        validURLs.forEach(System.out::println);
    }
}
