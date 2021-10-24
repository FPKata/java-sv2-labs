package arrayofarrays;

public class DailyValues {
    public static int[][] getValues(){
        int size = 12;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] values = new int[size][];
        for (int i = 0; i < size; i++){
            values[i] = new int[month[i]];
        }
        return values;
    }

    public static void main(String[] args) {
        int[][] values = getValues();
        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values[i].length; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
