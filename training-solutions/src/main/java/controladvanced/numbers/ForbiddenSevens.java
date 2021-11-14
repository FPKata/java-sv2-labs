package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public void printNumbersWithoutSevens(int number){
        boolean notFinished = true;
        while(notFinished){
            if (number % 7 != 0 && !Integer.toString(number).contains("7")){
                System.out.print(number + " ");
                number++;
            }
            else if (number % 7 == 0){
                System.out.print("X" + " ");
                number++;
            }
            else{
                break;
            }
        }
//        for (int i = firstNumber; i >= firstNumber; i++) {
//            if (i % 7 == 0) {
//                System.out.println("X");
//                continue;
//            }
//            if (Integer.toString(i).contains("7")) {
//                break;
//            }
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) {
        ForbiddenSevens forbidden = new ForbiddenSevens();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mettől írjam ki a számokat?");
        int answer = scanner.nextInt();
        forbidden.printNumbersWithoutSevens(answer);
    }
}
