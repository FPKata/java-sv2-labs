package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {
    @Test
    void testAddDog(){
        Vet vet_1 = new Vet();
        vet_1.addDog(new Dog("Buksi", 8, Species.GERMAN_SHEPHERD));
        vet_1.addDog(new Dog("Morzsi", 3, Species.BEAGLE));
        vet_1.addDog(new Dog("Cézár", 4, Species.LABRADOR));

        Vet vet_2 = new Vet();
        vet_2.addDog(new Dog("Rex", 7, Species.GERMAN_SHEPHERD));
        vet_2.addDog(new Dog("Lady", 1, Species.GOLDEN_RETRIEVER));

        vet_1.addDog(new Dog("Mackó", 13, Species.MIXTURE));
        vet_2.addDog(new Dog("Folti", 10, Species.MIXTURE));

        long number = vet_2.getRegisteredDogs().get(2).getCodeNumber();

        assertEquals(7L, number);
    }
}