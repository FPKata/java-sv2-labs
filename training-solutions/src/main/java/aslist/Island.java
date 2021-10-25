package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("suntan lotion", "knife", "matches");
        //function printOut()
        for (String item : importantThings){
            System.out.print(item + ", ");
        }
        System.out.println();
        int num = importantThings.indexOf("suntan lotion");
        importantThings.set(num, "shampoo");
        for (String item : importantThings){
            System.out.print(item + ", ");
        }
    }
}
