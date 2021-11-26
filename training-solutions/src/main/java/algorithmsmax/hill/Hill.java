package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> hilltops){
        int max = Integer.MIN_VALUE;
        for (Integer actual : hilltops){
            if (actual > max){
                max = actual;
            }
        }
        return max;
    }
}
