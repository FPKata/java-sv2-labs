package algorithmscount.transaction;

public class Digits {
    public int getCountOfNumbers(){
        int count = 0;
        for (int i = 10; i < 100; i++){
            String text = Integer.toString(i);  //numberString
            if (text.charAt(0) + 5 == text.charAt(1) || text.charAt(0) - 5 == text.charAt(1)){
                count++;
            }
        }
        return count;
    }
}
