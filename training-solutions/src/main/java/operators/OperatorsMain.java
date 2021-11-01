package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        //decimal to binary
        System.out.println(operators.decimalToBinary(34));
        System.out.println("------------");
        //isEven()
        System.out.println(operators.isEven(33));
        System.out.println(operators.isEven(16));
        System.out.println("------------");
        //division
        System.out.println(operators.getResultOfDivision(13, 5));
        System.out.println("------------");
        //to be or not to be null
        System.out.println(operators.isNull(""));
        System.out.println(operators.isNull("hhh"));
        System.out.println(operators.isNull(null));
        System.out.println("------------");
        //is empty
        System.out.println(operators.isEmpty("asdfg"));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
    }
}
