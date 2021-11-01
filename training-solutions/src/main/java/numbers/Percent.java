package numbers;

public class Percent {
    public double getValue(int number, int percent){
        return (number / 100.0) * percent;
    }
    public double getBase(int result, int percent){
        return (result * 100.0) / percent;
    }
    public  double getPercent(int number1, int number2){
        return (number2 * 100.0) / number1;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        //szám valahány %-a
        System.out.println(percent.getValue(100, 27));
        System.out.println("--------");
        //minek a valahány %-0 x
        System.out.println(percent.getBase(51, 17));
        //x hány százaléka y
        System.out.println("--------");
        System.out.println(percent.getPercent(100,73));
    }
}
