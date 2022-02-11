package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> flowers = new LinkedList<>();

    public List<String> getFlowers() {
        return new LinkedList<>(flowers);
    }

    public void addFlower(String flower){
        flowers.add(flower);
    }

    public void addFlowerIntoTheBunch(String flower){
        int pieces = flowers.size();
        int index = pieces / 2;
        if (pieces % 2 == 0){
            flowers.add(index, flower);
        }else{
            flowers.add(index, flower);
            flowers.add(index + 2, flower);
        }
    }
}
