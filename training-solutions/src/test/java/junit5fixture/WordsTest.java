package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void create(){
        words = new Words();
        words.addWord("alma");
        words.addWord("alga");
        words.addWord("almafa");
        words.addWord("körte");
        words.addWord("kinn");
        words.addWord("kolbász");
        words.addWord("sötét");
    }

    @Test
    void testGetWordsStartWith(){
        List<String> startWith = Arrays.asList("alma", "alga", "almafa");
        words.getWordsStartWith("al");

        assertEquals(startWith, words.getWords());
    }

    @Test
    void testGetWordsWithLength(){
        List<String> withLength = Arrays.asList("körte", "sötét");
        words.getWordsWithLength(5);

        assertEquals(withLength, words.getWords());
    }
}
