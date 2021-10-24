package arrayofarrays;

public class Triangular {
    public static int[][] triangularMatrix(int size){
        int[][] matrix = new int[size][];
        for (int i = 0; i < size; i++){
            matrix[i] = new int[i+1];
            for (int j = 0; j <= i; j++){
                matrix[i][j] = i;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int size = 6;
        int[][] triang = triangularMatrix(size);
        for (int i = 0; i < size; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(triang[i][j] + " ");
            }
            System.out.println();
        }
    }
}
