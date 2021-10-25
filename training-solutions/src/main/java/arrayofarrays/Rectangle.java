package arrayofarrays;

public class Rectangle {
    public  static  int[][] rectangularMatrix(int size){
        int[][] rectMatrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                rectMatrix[i][j] = i;
            }
        }
        return rectMatrix;
    }

    public static void main(String[] args) {
        int size = 5;
        int [][] rectMatrix = rectangularMatrix(size);
            for (int i = 0; i < size; i++){
                for (int j = 0; j< size; j++){
                    System.out.print(rectMatrix[i][j] + " ");
                }
                System.out.println();
        }
    }
}
