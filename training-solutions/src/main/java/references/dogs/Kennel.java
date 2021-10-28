package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Lucky", 6, "grey");
        Dog dog2 = new Dog("Fluffy", 1, "black");
        Dog dog3 = new Dog("Sam", 12, "white");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(" 1. lista");
        for (Dog item : dogs){
            System.out.println(item);
        }

        Dog dog4 = dog1;
        dog4.setColour("brown");
        System.out.println(" 2. lista");
        for (Dog item : dogs){
            System.out.println(item);
        }

        Dog dog5 = new Dog("Smurf", 3, "blue");
        System.out.println("Dog5 :");
        System.out.println(dog5);
        dog5 = dog1;
        System.out.println("dog5 <-- dog1");
        System.out.println(dog5);
        dogs.add(dog5);
        System.out.println("3. lista");
        for (Dog item : dogs){
            System.out.println(item);
        }
        Dog dog6 = dog4;
        dog6.setColour("dotted");
        System.out.println("4. lista");
        for (Dog item : dogs){
            System.out.println(item);
        }
        List<Dog> newList = dogs;
        Dog dog7 = dog4;
        dog7.setColour("sparkly");
        System.out.println("5. lista");
        for (Dog item : newList){
            System.out.println(item);
        }
        dog2.setColour("striped");
        System.out.println("6. lista");
        for (Dog item : newList){
            System.out.println(item);
        }
        dog2 = null;
        System.out.println("7. lista " + dog2);
        for (Dog item : newList){
            System.out.println(item);
        }
        Dog dog8 =dog1;
        dog8 = null;
        System.out.println("8. lista " + dog8 );
        for (Dog item : newList){
            System.out.println(item);
        }
        Dog dog9 =dog1;
        dog9.setColour("pink");
        System.out.println("9. lista " + dog9 );
        for (Dog item : newList){
            System.out.println(item);
        }
    }
}
