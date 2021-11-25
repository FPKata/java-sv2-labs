package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot:");
        int firstOperand = 0;
        try {
            firstOperand = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            System.out.println("Nem szám.");
            System.out.println("Alapértelmezetten 0 lesz.");
        }

        System.out.println("Kérem a második számot:");
        int secondOperand = 0;
        try {
            secondOperand = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            System.out.println("Nem szám.");
            System.out.println("Alapértelmezetten 0 lesz.");
        }

        System.out.println("Milyen műveletet végezzek el rajtuk: (+, -, *, /)");
        String operator = scanner.nextLine();
        switch(operator){
            case "+":
                System.out.println(calculator.add(firstOperand, secondOperand));
                break;
            case "-":
                System.out.println(calculator.subtract(firstOperand, secondOperand));
                break;
            case "*":
                System.out.println(calculator.multiply(firstOperand,secondOperand));
                break;
            case "/":
                try {
                    System.out.println(calculator.divide(firstOperand, secondOperand));
                    break;
                }catch (ArithmeticException ae){
                    System.out.println("A nullával való osztás értelmetlen.");
                    break;
                }
            default:
                System.out.println("Nincs ilyen művelet...");
        }
    }
}
