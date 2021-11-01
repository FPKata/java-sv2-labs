package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> numbers = new ArrayList<>();

    public void addDigitsToList(String text){
        char[] chars = text.toCharArray();
        for (char item : chars)
            {
              if (Character.isDigit(item)){
                  String digitStr = Character.toString(item);
                  int number = Integer.parseInt(digitStr);
                  numbers.add(number);
              }
            }
        
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
    public static void main(String[] args) {
        Digits d = new Digits();
        d.addDigitsToList("123 4tz 6+-*678");
        System.out.println(d.getNumbers());
    }

}
