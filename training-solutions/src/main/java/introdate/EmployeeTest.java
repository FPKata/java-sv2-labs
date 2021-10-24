package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee's name:");
        String name = scanner.nextLine();

        System.out.println("Employee's date of birth (yyyy-MM-dd):");
        String dateOfBirth = scanner.nextLine();
        //default pattern: yyyy-MM-dd
        LocalDate birth = LocalDate.parse(dateOfBirth);

        System.out.println("Employee's begin of employment (yyyy-MM-ddTHH:mm:ss):");
        String beginOfEmployment = scanner.nextLine();
        //default pattern yyyy-MM-ddTHH:mm:ss
        LocalDateTime beginEmp = LocalDateTime.parse(beginOfEmployment);

        Employee employee = new Employee(name, birth, beginEmp);
        System.out.println("Employee: " + employee.getName());
        employee.setName("Jane Doe");
        System.out.println("Employee's new name: " + employee.getName());
        System.out.println("Date of birth :" + employee.getDateOfBirth());
        System.out.println("Beginning of employment: " + employee.getBeginEmployment());
    }
}
