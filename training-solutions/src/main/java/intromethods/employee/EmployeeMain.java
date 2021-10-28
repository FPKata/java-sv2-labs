package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 2021, 500000);
        System.out.println(employee);

        employee.setName("New Name");
        System.out.println(employee);

        employee.raiseSalary(50000);
        System.out.println("Name :" + employee.getName());
        System.out.println("Hiring year :" + employee.getHiringYear());
        System.out.println("Salary :" + employee.getSalary());
    }
}
