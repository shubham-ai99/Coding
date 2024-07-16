package Java8.StreamApi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;



public class Example {


    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(1, "John Doe"));
        employeeSet.add(new Employee(2, "Jane Smith"));
        employeeSet.add(new Employee(3, "Emily Davis"));
        employeeSet.add(new Employee(4, "Jane Smith"));
        employeeSet.add(new Employee(5, "Emily Davis"));



//        Set<Employee> distinctEmployees = employeeSet.stream().collect(Collectors.toCollection(HashSet::new));

        //Set<Employee> distinctEmployees = employeeSet.stream()
        //                                                     .collect(Collectors.toSet());

//        Set<Employee> distinctEmployees = employeeSet.stream()
//                                                              .distinct()
//                                                              .collect(Collectors.toSet());

//        Set<Employee> distinctEmployees = new LinkedHashSet<>(employeeSet);



//        System.out.println(distinctEmployees);

        Set<Employee> uniqueEmployees = employeeSet.stream()
                .collect(Collectors.toCollection(() -> new HashSet<>(employeeSet)));

        uniqueEmployees.forEach(System.out::println);
    }
}
