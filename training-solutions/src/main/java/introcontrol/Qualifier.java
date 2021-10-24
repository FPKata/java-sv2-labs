package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int number = scanner.nextInt();
        if(number >100){
            System.out.println("Your number is bigger than 100.");
        }
        else{
            System.out.println("Your number is 100 or smaller than 100.");
        }
    }
}
