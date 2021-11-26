package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightThan(List<Integer> heights, int minHeight){
        int numberOfPlayers = 0;
        for (Integer actual : heights){
            if (actual > minHeight){
                numberOfPlayers++;
            }
        }
        return numberOfPlayers;
    }
}
