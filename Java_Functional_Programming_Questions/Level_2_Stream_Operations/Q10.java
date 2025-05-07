package Java_Functional_Programming_Questions.Level_2_Stream_Operations;

import java.util.ArrayList;
import java.util.List;

public class Q10
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aryan");
        names.add("Raj");
        names.add("Ankita");
        names.add("Aman");
        names.add("Abhishek");

        List<String> filteredNames = filterNames(names);
        System.out.println(filteredNames);
    }

    public static List<String> filterNames(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 4) {
                result.add(name);
            }
        }
        return result;
    }
}

