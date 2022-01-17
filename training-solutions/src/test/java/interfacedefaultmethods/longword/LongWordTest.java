package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {
    @Test
    void testLongWord(){
        LongWord longWord = new LongWord(Path.of("src/test/resources/longword.txt"));

        assertEquals("LONGWORD", longWord.getLongWord());
    }

    @Test
    void testLongWordFileIsNotExisting(){
        LongWord longWord = new LongWord(Path.of("src/test/resources/longword_.txt"));

        Exception exception = assertThrows(IllegalStateException.class, () -> longWord.getLongWord());
        assertEquals("Cannot read file!", exception.getMessage());

    }
}