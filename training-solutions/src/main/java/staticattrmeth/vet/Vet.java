package staticattrmeth.vet;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> registeredDogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getRegisteredDogs() {
        return registeredDogs;
    }

    public void addDog(Dog dog){
        dog.setCodeNumber(code);
        registeredDogs.add(dog);
        code++;
    }
}
