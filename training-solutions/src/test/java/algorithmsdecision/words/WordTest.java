package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void testContainsLongerWord(){
        Word word = new Word();
        List<String> list = Arrays.asList("alma", "barack", "farakás", "cseresznye");
        assertTrue(word.containsLongerWord(list, "babzsák"));
        assertFalse(word.containsLongerWord(list, "légkalapács"));
        assertFalse(word.containsLongerWord(list, "cseresznye"));
    }
}