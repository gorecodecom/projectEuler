package com.gorecode.projecteuler.problem004Test;

import com.gorecode.projecteuler.problem004.LargestPalindrome;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    public void testPalindromeNumber() {
        int one = 9119;
        int two = 10100101;
        int three = 94384;
        int four = 9115119;

        assertTrue(LargestPalindrome.isPalindrome(one));
        assertTrue(LargestPalindrome.isPalindrome(two));
        assertFalse(LargestPalindrome.isPalindrome(three));
        assertTrue(LargestPalindrome.isPalindrome(four));
    }

    @Test
    public void testReversePalindrome() {
        int one = 637478;
        int two = 84759;
        int three = 84759;

        assertEquals(874736, LargestPalindrome.reverse(one));
        assertEquals(95748, LargestPalindrome.reverse(two));
        assertEquals(95748, LargestPalindrome.reverse(three));

        assertFalse(LargestPalindrome.isPalindrome(one));
        assertFalse(LargestPalindrome.isPalindrome(two));
        assertFalse(LargestPalindrome.isPalindrome(three));
    }
}
