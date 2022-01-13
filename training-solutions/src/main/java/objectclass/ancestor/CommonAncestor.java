package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        Fruit fruit = new Fruit();
        objectList.add(fruit);
        Apple apple = new Apple();
        objectList.add(apple);
        Starking starking = new Starking();
        objectList.add(starking);
        Vegetable vegetable = new Vegetable();
        objectList.add(vegetable);

        objectList.add("alma");
        objectList.add(12);
        objectList.add('x');
        objectList.add(LocalDate.now());
        objectList.add(new int[] {1, 2, 3, 4, 5});
        objectList.add(new ArrayList<>(Arrays.asList("egy", "kettő", "három")));

        System.out.println(objectList);
    }
}
