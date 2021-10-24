package arrayofarrays;

public class ArrayOfArrays {
    public static void printArrayOfArrays(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = new int[][] {{3, 14, 5}, {21, 23, 4, 0}, {0, 7}, {2, 56, 3}};
        printArrayOfArrays(a);
    }
}
