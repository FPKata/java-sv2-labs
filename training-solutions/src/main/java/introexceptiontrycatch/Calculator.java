package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot:");
        String firstOperand = scanner.nextLine();
        int number1 = 0;

        try{
            number1 = Integer.parseInt(firstOperand);
        }catch (NumberFormatException nfe){
            System.out.println("Nem szám!");
            System.out.println("Alapértelmezettként 0 lesz.");
        }

        System.out.println("Kérem a második számot:");
        String secondOperand = scanner.nextLine();
        int number2 = 0;

        try{
            number2 = Integer.parseInt(secondOperand);
        }catch (NumberFormatException nfe){
            System.out.println("Nem szám!");
            System.out.println("Alapértelmezettként 0 lesz");
        }

        System.out.println("Milyen műveletet végezzek el rajtuk: (+, -, *, /)");
        String operator = scanner.nextLine();

        switch(operator){
            case "+":
                System.out.println(number1 + number2);
            break;
            case "-":
                System.out.println(number1 - number2);
            break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
            try{
                System.out.println(number1 / number2);
                break;
            }
            catch(ArithmeticException ae){
                System.out.println("A 0-val való osztás értelmetlen");
                break;
            }
            default:
                System.out.println("Nincs ilyen művelet...");
        }
    }
}
