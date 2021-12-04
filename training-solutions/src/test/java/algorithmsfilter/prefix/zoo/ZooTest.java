package algorithmsfilter.prefix.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    Zoo zoo;
    @Test
    void testGetAnimalsWithNumberOfLegs(){
        List<Animal> animals = Arrays.asList(new Animal("fóka", 0),
                new Animal("kenguru", 2),
                new Animal("szalamandra", 4),
                new Animal("oroszlán", 4),
                new Animal("delfin", 0),
                new Animal("varangy", 4));
        zoo = new Zoo(animals);

        List<Animal> filtered = zoo.getAnimalsWithNumberOfLegs(0);
        assertEquals(2, filtered.size());

        List<Animal> newFiltered = zoo.getAnimalsWithNumberOfLegs(4);
        assertEquals(3, newFiltered.size());
    }
}