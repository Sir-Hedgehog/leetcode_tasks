package ru.twopointer.level.easy;

/*


        Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
        The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
        Note:
        Your returned answers (both index1 and index2) are not zero-based.
        You may assume that each input would have exactly one solution and you may not use the same element twice.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 07.10.2020
 */

public class TwoSum {

    /**
     * Метод итеративно находит индексы элементов массива, сумма значений которых равно указанному числу в параметре метода
     * @param numbers - массив
     * @param target - указанное число
     * @return - индексы элементов массива, сумма значений которых равно указанному числу в параметре метода
     */

    public int[] twoSumForIterator(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int[0];
        }
        int beginning = 0;
        int end = numbers.length - 1;
        while (beginning < end) {
            int sum = numbers[beginning] + numbers[end];
            if (sum == target) {
                return new int[]{beginning + 1, end + 1};
            } else if (sum < target) {
                ++beginning;
            } else {
                --end;
            }
        }
        return new int[0];
    }

    /**
     * Метод рекурсивно находит индексы элементов массива, сумма значений которых равно указанному числу в параметре метода
     * @param numbers - массив
     * @param target - указанное число
     * @return - индексы элементов массива, сумма значений которых равно указанному числу в параметре метода
     */

    public int[] twoSumForRecursion(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int[0];
        }
        int[] array = new int[2];
        for (int index = numbers.length - 1; index > 0; index--) {
            if ((numbers[numbers.length - 1] + numbers[index - 1]) == target) {
                array[0] = index;
                array[1] = numbers.length;
                return array;
            }
            if (index - 1 == 0) {
                int[] current = new int[numbers.length - 1];
                System.arraycopy(numbers, 0, current, 0, numbers.length - 1);
                return this.twoSumForRecursion(current, target);
            }
        }
        return array;
    }
}
