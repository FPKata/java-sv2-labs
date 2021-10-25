package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));
        //int newPieces = 3;
        //int oldPieces = 2;
        for (int i = 2; i < 5; i++ ){
            Integer item = elements.get(i - 2) * elements.get(i - 1);
            elements.add(item);
        }
        for (Integer item : elements){
            System.out.print(item + ", ");
        }
    }
}
