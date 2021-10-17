package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int firstNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second number:");
        int secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println(firstNum + " + " + secondNum);
        System.out.println(firstNum + secondNum);
    }
}
