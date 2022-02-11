package ru.palindrome;

import org.junit.Test;
import ru.integers.Palindrome;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.02.2022
 */
public class PalindromeTest {

    @Test
    public void whenEvenPalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(15351);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenOddPalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(159951);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenEvenNotPalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(10471);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenOddNotPalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(159756);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenNegativePalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(-10401);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenPalindromeWithOneNumber() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(7);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenBigPalindrome() {
        var draft = new Palindrome();
        var result = draft.isPalindrome(1000000001);
        var expected = true;
        assertEquals(result, expected);
    }
}
