package intromethods.employee;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", LocalDate.of(2019, 11,11), 500000);
        System.out.println("Name :" + employee.getName());
        System.out.println("Hiring year :" + employee.getHiringYear());
        System.out.println("Salary :" + employee.getSalary());

        employee.setName("New Name");
        employee.raiseSalary(50000);

        System.out.println("Name :" + employee.getName());
        System.out.println("Hiring year :" + employee.getHiringYear());
        System.out.println("Salary :" + employee.getSalary());
    }
}
