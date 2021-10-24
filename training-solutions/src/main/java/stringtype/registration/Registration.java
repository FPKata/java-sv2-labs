package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username!");
        String username = scanner.nextLine();
        System.out.println("Enter your password!");
        String password1 = scanner.nextLine();
        System.out.println("Enter your password again!");
        String password2 = scanner.nextLine();
        System.out.println("Enter your email address!");
        String email = scanner.nextLine();

        String nameCheckMessage = UserValidator.isValidUsername(username)
                ? "Username is correct" : "Username is not correct";

        String passwordCheckMessage = UserValidator.isValidPassword(password1, password2)
                ? "Password is correct." : "Password is not correct.";

        String emailCheckMessage = UserValidator.isValidEmail(email)
                ? "Email is correct." :"Email is not correct." ;
        System.out.println(nameCheckMessage);
        System.out.println(passwordCheckMessage);
        System.out.println(emailCheckMessage);
    }
}
