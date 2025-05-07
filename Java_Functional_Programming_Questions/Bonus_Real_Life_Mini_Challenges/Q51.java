package Java_Functional_Programming_Questions.Bonus_Real_Life_Mini_Challenges;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q51 {

    public static Map<String, Integer> analyzeText(String paragraph) {
        // Remove punctuation and convert to lowercase
        String cleanedParagraph = paragraph.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        // Split the paragraph into words and count the frequency of each word using streams
        Map<String, Integer> wordCountMap = Arrays.stream(cleanedParagraph.split("\\s+"))
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

        return wordCountMap;
    }

    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. This paragraph is for testing the text analyzer.";
        Map<String, Integer> wordCountMap = analyzeText(paragraph);

        // Print the word frequencies
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

