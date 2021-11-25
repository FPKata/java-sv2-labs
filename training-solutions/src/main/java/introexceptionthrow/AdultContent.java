package introexceptionthrow;

import java.util.Scanner;

public class AdultContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        Adult adult = new Adult(age);
    }
}
