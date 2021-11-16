package introexceptiontrycatchtrace;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Kérem az első számot:");
        calculator.input1();
        System.out.println("Kérem a második számot:");
        calculator.input2();
        System.out.println("Milyen műveletet végezzek el rajtuk: (+, -, *, /)");
        String operator = calculator.inputOperator();
        calculator.getItRight(operator);
    }
}
