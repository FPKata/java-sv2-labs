package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> freezer = new ArrayList<>();
        freezer.add("meat");
        freezer.add("egg");
        freezer.add("bread");
        freezer.add("sausage");
        freezer.add("broccoli");
        System.out.println("Freezer's content: " + freezer);
        System.out.println("Its size: " + freezer.size());
    }
}
