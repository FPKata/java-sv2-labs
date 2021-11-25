package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome our page! \nPlease enter your name:");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Enter your age:");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

    }
}
