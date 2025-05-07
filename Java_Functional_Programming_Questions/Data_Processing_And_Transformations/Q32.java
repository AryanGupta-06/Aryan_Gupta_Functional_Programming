package Java_Functional_Programming_Questions.Data_Processing_And_Transformations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class Q32 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 60));
        students.add(new Student("Eve", 95));

        List<String> topStudents = getTopStudents(students);
        System.out.println("Students who scored above 80: " + topStudents);
    }

    public static List<String> getTopStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.grade > 80)
                .map(student -> student.name)
                .sorted()
                .collect(Collectors.toList());
    }
}

