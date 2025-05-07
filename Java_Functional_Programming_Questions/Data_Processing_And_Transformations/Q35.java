package Java_Functional_Programming_Questions.Data_Processing_And_Transformations;

import java.util.*;
import java.util.stream.Collectors;

class Employe {
    String name;
    String department;
    double salary;

    Employe(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class Q35 {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
                new Employe("John", "HR", 50000),
                new Employe("Jane", "HR", 60000),
                new Employe("Doe", "Engineering", 80000),
                new Employe("Smith", "Engineering", 90000),
                new Employe("Emily", "Marketing", 70000),
                new Employe("Anna", "Marketing", 75000)
        );

        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.averagingDouble(e -> e.salary)
                ));

        averageSalaryByDepartment.forEach((department, avgSalary) ->
                System.out.println("The average salary in " + department + " department is " + avgSalary)
        );
    }
}

