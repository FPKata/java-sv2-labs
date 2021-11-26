package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testCreate(){
        Trainer trainer = new Trainer("Tréner Mari", 10);
        assertEquals("Tréner Mari", trainer.getName());
        assertEquals(10, trainer.getAge());
    }
}