package Java_Functional_Programming_Questions.Custom_Types_And_Nested_Streams;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Q39 {

    public static Map<String, List<Person>> groupByAge(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(person -> {
            if (person.getAge() < 20) {
                return "<20";
            } else if (person.getAge() <= 40) {
                return "20-40";
            } else {
                return "40+";
            }
        }));
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 35),
                new Person("David", 45),
                new Person("Eve", 15)
        );

        Map<String, List<Person>> ageGroups = groupByAge(people);

        ageGroups.forEach((ageGroup, group) -> {
            System.out.println(ageGroup + ": " + group);
        });
    }
}

