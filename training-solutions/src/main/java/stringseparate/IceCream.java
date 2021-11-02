package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        List<String> iceCreams = new ArrayList<>(Arrays.asList("málna", "csoki", "sárgadinnye", "vanília"));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iceCreams.size(); i++){
            sb.append(iceCreams.get(i));
            if (i != iceCreams.size() - 1){
                sb.append(", ");
            }else{
                sb.append(". ");
            }
        }
        System.out.println("Ma kapható: " + sb + "Gyerekeknek féláron!");
    }
}
