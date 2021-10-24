package array;


public class ArrayMain {
    public static void main(String[] args) {
        //első
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfWeek[1]);

        //második
        int[] power2 = new int[5];
        power2[0] = 1;
        for (int i = 1; i < power2.length; i++){
            power2[i] = power2[i-1] * 2;
        }
        for (int item : power2 ){
            System.out.print(item + " ");
        }

        System.out.println();

        //harmadik
        boolean[] alternating = new boolean[6];
        alternating[0] = false;
        for (int i = 1; i < alternating.length; i++){
            alternating[i] = !alternating[i - 1];
        }
        for (boolean item : alternating){
            System.out.print(item + " ");
        }
    }
}
