package Java_Functional_Programming_Questions.Level_1_Basics;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        // Define the list of strings
        List<String> stringsList = new ArrayList<>();
        stringsList.add("apple");
        stringsList.add("banana");
        stringsList.add("elderberry");
        stringsList.add("cherry");
        stringsList.add("fig");
        stringsList.add("grape");
        stringsList.add("date");

        // Sort the list using a lambda expression
        stringsList.sort((s1, s2) -> s1.compareTo(s2));

        // Print the sorted list
        System.out.println(stringsList);
    }
}

