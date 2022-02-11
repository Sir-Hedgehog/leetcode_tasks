package ru.integers;

/*

    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.

 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.02.2022
 */
public class Palindrome {

    /**
     * Метод определяет является ли входящее число палиндромом
     * @param number - входящее число
     * @return - истина или ложь
     */

    public boolean isPalindrome(int number) {
        var original = number;
        var reversedNumber = 0;

        if (number < 0) {
            return false;
        }

        while (number != 0) {
            var element = number % 10;
            number = number / 10;
            reversedNumber = number == 0 ? element + reversedNumber : element * 10 + reversedNumber * 10;
        }

        return reversedNumber == original;
    }
}
