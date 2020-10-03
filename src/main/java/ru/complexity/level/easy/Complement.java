package ru.complexity.level.easy;

/*


        Every non-negative integer N has a binary representation.
        For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.
        Note that except for N = 0, there are no leading zeroes in any binary representation.
        The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.
        For example, the complement of "101" in binary is "010" in binary.
        For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.


 */


/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.10.2020
 */

public class Complement {
    public int bitwiseComplement(int number) {
        String binaryString = Integer.toBinaryString(number);
        char[] reverseChars = new char[binaryString.length()];
        char[] charArray = binaryString.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] == '0') {
                reverseChars[index] = '1';
            } else {
                reverseChars[index] = '0';
            }
        }
        return Integer.parseInt(new String(reverseChars), 2);
    }

    public static void main(String[] args) {
        Complement complement = new Complement();
        System.out.println(complement.bitwiseComplement(19));
        System.out.println(complement.bitwiseComplement(9));
        System.out.println(complement.bitwiseComplement(258));
    }
}
