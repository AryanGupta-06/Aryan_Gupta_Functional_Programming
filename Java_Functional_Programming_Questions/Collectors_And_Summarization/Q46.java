package Java_Functional_Programming_Questions.Collectors_And_Summarization;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int joiningYear;
    double salary;

    public Employee(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", joiningYear=" + joiningYear +
                ", salary=" + salary +
                '}';
    }
}

public class Q46 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 2020, 50000),
                new Employee("Bob", 2021, 60000),
                new Employee("Charlie", 2020, 70000),
                new Employee("David", 2021, 55000),
                new Employee("Eve", 2022, 75000)
        );

        Map<Integer, Optional<Employee>> maxSalaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        maxSalaryByYear.forEach((year, employee) ->
                System.out.println("Year: " + year + ", Max Salary: " + employee.get().getSalary() + ", Employee: " + employee.get().name));
    }
}

