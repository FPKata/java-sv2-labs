package array;

public class ArrayHandler{
    public static void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = source[i] + i;
        }
    }

    public static void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 32, 43, 5, 2, 87};
        String[] words = new String[]{"bean", "pig", "pepper", "salt", "tomato", "lard"};
        addIndexToNumber(numbers);
        concatenateIndexToWord(words);
        //numbers
        for (int item : numbers) {
            System.out.println(item);
        }
        for (int item : numbers) {
            System.out.print(item + ", ");
        }
        //words
        for (String item : words) {
            System.out.println(item);
        }
        for (String item : words) {
            System.out.print(item + ", ");
        }
    }
}
