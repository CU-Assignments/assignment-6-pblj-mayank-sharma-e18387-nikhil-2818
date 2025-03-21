package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 70000),
            new Employee("Bob", 25, 50000),
            new Employee("Charlie", 35, 80000)
        );
        List<Employee> sortedByName = employees.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());
        System.out.println("Sorted by name: " + sortedByName);
        List<Employee> sortedByAge = employees.stream()
            .sorted(Comparator.comparingInt(Employee::getAge))
            .collect(Collectors.toList());
        System.out.println("Sorted by age: " + sortedByAge);
        List<Employee> sortedBySalary = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());
        System.out.println("Sorted by salary: " + sortedBySalary);
    }
}

