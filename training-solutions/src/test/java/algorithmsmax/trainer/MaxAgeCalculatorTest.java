package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {
    MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
    @Test
    void testGetTrainerWithMaxAge(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Kiss Péter", 49),
                new Trainer("Pogácsás Béla", 77),
                new Trainer("Bartha Nóra", 55),
                new Trainer("Nagy Szilvia", 13),
                new Trainer("Tóth Bálint", 82));

        assertEquals(82, maxAgeCalculator.getTrainerWithMaxAge(trainers).getAge());
        assertEquals("Tóth Bálint", maxAgeCalculator.getTrainerWithMaxAge(trainers).getName());
    }

}