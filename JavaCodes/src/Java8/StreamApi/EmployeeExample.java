package Java8.StreamApi;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeExample {
        private int id;
        private String name;
        private String department;

    public EmployeeExample(int i, String johnDoe, String it) {
    }
    // Constructor, getters, and setters omitted for brevity
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
        // Override equals and hashCode to compare employees by id
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.getId();
        }
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
        public static void main(String[] args) {
            List<EmployeeExample> employees = Arrays.asList(
                    new EmployeeExample(1, "John Doe", "IT"),
                    new EmployeeExample(2, "Jane Smith", "HR"),
                    new EmployeeExample(1, "Johny Bravo", "IT"),
                    new EmployeeExample(3, "Jack Johnson", "Finance"),
                    new EmployeeExample(2, "Jane Smith", "HR")
            );
            // Remove duplicates based on employee id
            List<EmployeeExample> uniqueEmployees = employees.stream()
                    .distinct()
                    .collect(Collectors.toList());
            // Print unique employees
            uniqueEmployees.forEach(System.out::println);
        }
    }
