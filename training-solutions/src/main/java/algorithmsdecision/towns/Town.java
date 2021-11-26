package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> habitants, int number){
        boolean contains = false;
        int i = 0;
        while (!contains && i < habitants.size()){
            if (habitants.get(i) < number){
                contains = true;
            }
            i++;
        }
        return contains;
    }
}
