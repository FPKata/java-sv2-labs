package operators;

public class Operators {
    public String decimalToBinary(int decimalNumber){
        return Integer.toBinaryString(decimalNumber);
    }
    public boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    public String getResultOfDivision(int number, int divisor){
        int result = number / divisor;
        int remainder = number % divisor;
        return number + "/" + divisor + "=" + result + ", maradék: " + remainder;
    }
    public String isNull(String s){
        return s == null ? "null értékű" : "nem null értékű";
    }
    public boolean isEmpty(String s){
        return s == null || s.equals("");
    }
}
