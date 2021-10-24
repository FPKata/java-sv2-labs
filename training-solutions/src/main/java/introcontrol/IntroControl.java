package introcontrol;

public class IntroControl {
    private IntroControl(){
    }

    public static int subtractTenIfGreaterThanTen(int number){
        if(number <= 10){
            return number;
        }
        return number - 10;
    }

    public static String describeNumber(int number){
        if(number == 0){
            return "zero";
        }
        return "not zero";
    }

    public static String greetingToJoe(String name){
        if("Joe".equals(name)){
            return "Hello Joe";
        }
        return "";
    }

    public static int calculateBonus(int sale){
        if(sale >= 1000000){
            return sale / 10;
        }
        return 0;
    }

    public static int calculateConsumption(int prev, int next) {
        if (prev < next) {
            return 10000 - next + prev;
        } else {
            return prev - next;
        }
    }
    public static void printNumbers(int max){
        for (int i = 0; i <= max; i++){
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printNumbersBetween(int min, int max){
        for(int i = min; i <= max; i++){
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.print(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int max){
        for(int i = 1; i <= max; i++){
            if ((i % 2) != 0){
                System.out.println(i + "   páratlan");
            }
        }
    }
}
