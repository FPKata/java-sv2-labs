package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    Word word = new Word();
    @Test
    void testGetFirstWordsWithA(){
        Path path = Path.of("src/test/resources/words.txt");

        assertEquals("Anna", word.getFirstWordWithA(path));
    }
    @Test
    void testGetFirstWordWithAWithNoWord(){
        Path path = Path.of("src/test/resources/noword.txt");

        assertEquals("A", word.getFirstWordWithA(path));
    }
    @Test
    void testGetFirstWordWithAWithNoFile(){
        Path path = Path.of("src/test/resources/noword.tx");

        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> word.getFirstWordWithA(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}