package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public int input1(){
        int firstOperand = scanner.nextInt();
        return firstOperand;
    }

    public int input2(){
        int secondOperand = scanner.nextInt();
        return secondOperand;
    }
    
    public String inputOperator() {
        return scanner.nextLine();
    }
    
    public void getItRight(String operator){
        switch(operator){
            case "+":
                System.out.println(input1() + input2());
                break;
            case "-":
                System.out.println(input1() - input2());
                break;
            case "*":
                System.out.println(input1() * input2());
                break;
            case "/":
                System.out.println(input1() / input2());
                break;
            default:
                System.out.println("Nincs ilyen művelet...");
        }
    }
}

