package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void testCreate(){
        Animal animal = new Animal("elefánt", 4);

        assertEquals("elefánt", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }
}