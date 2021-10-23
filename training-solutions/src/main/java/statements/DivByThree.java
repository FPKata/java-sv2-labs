package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number :");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number % 3 == 0){
            System.out.println("It can be divided by 3.");
        }
        else {
            System.out.println("It cannot be divided by 3.");
        }
    }
}
