package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testIsPalindrome(){
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("q"));
        assertTrue(palindrome.isPalindrome(""));
        assertFalse(palindrome.isPalindrome("asdfg"));
    }
}