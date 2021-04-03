package ru.bit_manipulation.level.easy;

/*


        Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 07.10.2020
 */

public class NumberOfOneBits {

    /**
     * Метод находит количество единиц в числе битового представления
     * @param number - число
     * @return - количество единиц
     */

    public int getNumberOfOneBits(int number) {
        int counter = 0;
        String stringOfBits = Integer.toBinaryString(number);
        char[] charArray = stringOfBits.toCharArray();
        for (char element : charArray) {
            if (element == '1') {
                ++counter;
            }
        }
        return counter;
    }
}
