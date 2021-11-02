package formatlocalprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Elvis Presley", "John Lennon", "Liz Taylor", "Luke Skywalker"));
        for (String item : names) {
            System.out.printf("Kedves %s! Köszönjük, hogy termékünket választotta!", item);
            System.out.println();
        }
    }
}
