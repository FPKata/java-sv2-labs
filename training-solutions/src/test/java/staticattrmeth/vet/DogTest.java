package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void testCreate(){
        Dog dog = new Dog("Picúr", 2, Species.MIXTURE);

        assertEquals("Picúr", dog.getName());
        assertEquals(2, dog.getAge());
        assertEquals(Species.MIXTURE, dog.getType());
        assertEquals(0L, dog.getCodeNumber());
    }
}