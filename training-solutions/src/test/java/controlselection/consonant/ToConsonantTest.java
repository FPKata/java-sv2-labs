package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    ToConsonant toConsonant = new ToConsonant();
    @Test
    void testGetConsonantOrVowel(){
       assertEquals('b', toConsonant.getConsonantOrVowel('a'));
       assertEquals('b', toConsonant.getConsonantOrVowel('b'));
    }
}
