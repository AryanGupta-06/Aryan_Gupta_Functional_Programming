package Java_Functional_Programming_Questions.Data_Processing_And_Transformations;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

public class Q34 {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "Engineering"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Engineering"),
                new Employee("Eve", "Marketing")
        );

        // Group by department and count employees in each department
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // Print the result
        departmentCount.forEach((department, count) ->
                System.out.println(department + ": " + count));
    }
}

