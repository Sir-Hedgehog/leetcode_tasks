package ru.arrays.level.easy;

import java.util.Arrays;

/*


        Given an array, rotate the array to the right by k steps, where k is non-negative.
        Follow up:
        1) Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
        2) Could you do it in-place with O(1) extra space?


*/

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 05.10.2020
 */

public class RotateArray {

    /**
     * Метод перемещает указанное количество элементов с конца массива в его начало
     * @param numbers - массив
     * @param quantity - количество элементов для рокировки
     * @return - обновленный массив
     */

    public int[] rotate(int[] numbers, int quantity) {
        int temp;
        while (quantity > 0) {
            temp = numbers[numbers.length - 1];
            if (numbers.length - 1 >= 0) {
                System.arraycopy(numbers, 0, numbers, 1, numbers.length - 1);
            }
            numbers[0] = temp;
            quantity--;
        }
        return numbers;
    }
}
