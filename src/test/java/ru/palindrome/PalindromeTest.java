package ru.palindrome;

import org.junit.Test;
import ru.integers.Palindrome;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.1
 * @since 14.02.2022
 */
public class PalindromeTest {

    @Test
    public void whenEvenPalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(15351);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenOddPalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(159951);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenEvenNotPalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(10471);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenOddNotPalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(159756);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenNegativePalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(-10401);
        var expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void whenPalindromeWithOneNumber() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(7);
        var expected = true;
        assertEquals(result, expected);
    }

    @Test
    public void whenBigPalindrome() {
        var palindrome = new Palindrome();
        var result = palindrome.isPalindrome(1000000001);
        var expected = true;
        assertEquals(result, expected);
    }
}
