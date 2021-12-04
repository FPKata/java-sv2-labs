package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    Prefix prefix = new Prefix();

    @Test
    void testGetWordsStartWith(){
        List<String> words = Arrays.asList("John Doe", "Jane Doe", "Jane Eyre");

        List<String> filteredWords = prefix.getWordsStartWith(words, "Jane");
        assertEquals(2, filteredWords.size());
        assertTrue(filteredWords.contains("Jane Eyre"));
        assertFalse(filteredWords.contains("John Doe"));
    }
}