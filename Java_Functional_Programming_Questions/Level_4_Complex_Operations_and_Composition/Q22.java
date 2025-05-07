package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q22 {
    public static Map<String, Integer> mapWordLengths(List<String> words) {
        Map<String, Integer> wordLengthMap = new HashMap<>();
        for (String word : words) {
            wordLengthMap.put(word, word.length());
        }
        return wordLengthMap;
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");
        Map<String, Integer> result = mapWordLengths(words);
        System.out.println(result);
    }
}

