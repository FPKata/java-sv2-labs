package controliteration.division;

import java.util.Scanner;

public class Division {
    public void findSmallerThanWithFor(int number, int divisor){
        for (int i = 0; i < number; i++){
           getTheRightNumbers(i, divisor);
        }
        System.out.println();
    }

    public void findSmallerThanWithWhile(int number, int divisor){
        int i = 0;
        while (i < number){
            getTheRightNumbers(i, divisor);
            i++;
        }
    }

    public void getTheRightNumbers(int i, int divisor){
        if (i % divisor == 0){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();
        System.out.println("Adjon meg egy pozitív egész számot! " +
                           "A program ennél kisebb számokat fog kiírni.");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        System.out.println("FOR:");
        division.findSmallerThanWithFor(number, divisor);
        System.out.println("WHILE");
        division.findSmallerThanWithWhile(number, divisor);
    }
}
