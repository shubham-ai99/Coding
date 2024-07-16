package Java8.PracticeEmployee;


public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee emp1 = new Employee(1, null, 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);
        Employee emp3 = new Employee(3, "Charlie", 70000);

        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);

        System.out.println("All Employees: " + company.getAllEmployees());
        System.out.println("Total Salaries: " + company.getTotalSalaries());

        Employee emp = company.getEmployeeById(2);
        System.out.println("Employee with ID 2: " + emp);
    }
}

