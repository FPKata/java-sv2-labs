package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány elemét írjam ki a sorozatnak? (A szám legyen legalább 1!)");
        int number = scanner.nextInt();
        int first = 1;
        int second = 1;
        //Do while
        int i =1;
        do{
            System.out.print(first + " ");
            int seged = first + second;
            first = second;
            second = seged;
            i++;
        }
        while(i <= number);
        //While
//        int i = 1;
//        while (i <= number){
//            System.out.print(first + " ");
//            int seged = first + second;
//            first = second;
//            second = seged;
//            i++;
//        }
        //For
//        for (int i = 1; i <= number; i++){
//            System.out.print(first + " ");
//            int seged = first + second;
//            first = second;
//            second = seged;
//        }

    }
}
