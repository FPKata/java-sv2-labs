package algorithmsfilter.prefix.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegs(int numberOfLegs){
        List<Animal> filteredByLegs = new ArrayList<>();
        for (Animal actual :animals){
            if (actual.getNumberOfLegs() == numberOfLegs){
                filteredByLegs.add(actual);
            }
        }
        return filteredByLegs;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
