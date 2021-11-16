package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot:");
        int firstOperand = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a második számot:");
        int secondOperand = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Milyen műveletet végezzek el rajtuk: (+, -, *, /)");
        String operator = scanner.nextLine();

        try{
            switch(operator){
                case "+":
                    System.out.println(firstOperand + secondOperand);
                    break;
                case "-":
                    System.out.println(firstOperand - secondOperand);
                    break;
                case "*":
                    System.out.println(firstOperand * secondOperand);
                    break;
                case "/":
                    System.out.println(firstOperand / secondOperand);
                    break;
                default:
                    System.out.println("Nincs ilyen művelet...");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("A 0-val való osztás értelmetlen");
        }
    }
}
