package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String concatenateNames(String firstName, String surName){
        return firstName + " " + surName;
    }

    public LocalDate concatenateBirth(int year, int month, int day){
        return LocalDate.of(year, month, day);

    }
    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first name?");
        String firstName = scanner.nextLine();
        System.out.println("Your surname?");
        String surName =scanner.nextLine();
        System.out.println("Your day of birth?");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your month of birth?");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your year of birth?");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your email address?");
        String email = scanner.nextLine();

        String name = registration.concatenateNames(firstName, surName);
        LocalDate dateOfBirth = registration.concatenateBirth(year, month, day);

        Person person = new Person(name, dateOfBirth, email);
        System.out.println(person);
    }
}
