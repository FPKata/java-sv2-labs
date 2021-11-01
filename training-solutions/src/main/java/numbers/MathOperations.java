package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi az eredmény 4 tizedes pontossággal");
        System.out.println("(13 + 46) * (112 / 25 - 7) = ?");
        double myResult = (13.0 / 46) + (112.0 / 25 - 7);
        double result = scanner.nextDouble();
        if (Math.abs(myResult - result) < 0.0001){
            System.out.println("Jól számoltál");
        }
        else {
            System.out.println("Nem jól számoltál");
        }
    }
}
