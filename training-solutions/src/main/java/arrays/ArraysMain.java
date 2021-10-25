package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public static String multiplicationTableAsString(int size){
        int[][] multiplyingTable = new int[size][size];
        for (int i= 0; i < size; i++){
            for (int j = 0; j < size; j++){
                multiplyingTable[i][j] = (i+1) * (j+1);
            }
        }
        return Arrays.deepToString(multiplyingTable);
    }

    public static boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public static int min(int dayHours, int anotherDayHours){
        if (dayHours < anotherDayHours){
            return dayHours;
        }
        else return  anotherDayHours;
    }

    public static boolean sameTempValuesDayLight(double[] day, double[] anotherDay){
        int dayHours = day.length;
        int anotherDayHours = anotherDay.length;
        int shorterDay = ArraysMain.min(dayHours, anotherDayHours);
        return Arrays.equals(Arrays.copyOfRange(day, 0, shorterDay), Arrays.copyOfRange(anotherDay, 0, shorterDay));
    }

    public static boolean wonLottery(int[] myNumbers, int[] winningNumbers){
        Arrays.sort(myNumbers);
        Arrays.sort(winningNumbers);
        return Arrays.equals(myNumbers, winningNumbers);
    }


    public static void main(String[] args) {
        System.out.println("numberOfDaysAsString");
        System.out.println(ArraysMain.numberOfDaysAsString());

        System.out.println("multiplicationTableAsString");
        int size = 6;
        System.out.println(ArraysMain.multiplicationTableAsString(size));

        System.out.println("sameTempValues");
        System.out.println(ArraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));
        System.out.println(ArraysMain.sameTempValues(new double[] {1, 2, 5}, new double[] {1, 2, 3}));

        System.out.println("sameTempValuesDayLight");
        System.out.println(ArraysMain.sameTempValuesDayLight(new double[] {1, 2, 3}, new double[] {1, 2, 3, 4, 5}));
        System.out.println(ArraysMain.sameTempValuesDayLight(new double[] {2, 2, 3}, new double[] {1, 2, 3, 4, 5}));

        System.out.println("wonLottery");
        int[] myNumbers = new int[] {45, 21, 90, 66, 2};
        int[] winningNumbers = new int[] {45, 21, 90, 66, 2};
        boolean amIWinner = wonLottery(myNumbers, winningNumbers);
        String  message = amIWinner ? "I am a winner!!!" : "I am going to work...";
        System.out.println(message);
    }
}
