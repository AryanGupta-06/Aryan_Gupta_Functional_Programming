package Java_Functional_Programming_Questions.Level_4_Complex_Operations_and_Composition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Q25 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 17));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 19));
        people.add(new Person("David", 15));
        people.add(new Person("Eve", 22));

        List<String> adultNames = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Adults: " + adultNames);
    }
}

