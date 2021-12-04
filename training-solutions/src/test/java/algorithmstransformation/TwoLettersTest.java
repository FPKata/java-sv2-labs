package algorithmstransformation;

import algorithmstransformation.letters.TwoLetters;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    TwoLetters twoLetters = new TwoLetters();

    @Test
    void testGetFirstTwoLetters(){
        List<String> words = Arrays.asList("kocsi", "mamusz", "bajusz", "óra", "tehén");

        assertEquals(Arrays.asList("ko", "ma", "ba", "ór", "te"), twoLetters.getFirstTwoLetters(words));
    }

}