package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Pick 5 numbers!");
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 1; i <=5; i++){
            number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("The total is " + sum);
    }
}
