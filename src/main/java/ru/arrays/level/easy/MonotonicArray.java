package ru.arrays.level.easy;

/*

        An array is monotonic if it is either monotone increasing or monotone decreasing.
        An array A is monotone increasing if for all i <= j, A[i] <= A[j].
        An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
        Return true if and only if the given array A is monotonic.

*/

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 05.10.2020
 */

public class MonotonicArray {

    /**
     * Метод проверяет массив на монотонность убывания или возрастания элементов
     * @param array - массив
     * @return - монотонный массив или нет
     */

    public boolean isMonotonic(int[] array) {
        return checkLow(array) || checkUp(array);
    }

    /**
     * Метод проверяет массив на монотонность по возрастанию
     * @param array - массив
     * @return - монотонный массив или нет
     */

    private boolean checkUp(int[] array) {
        boolean result = true;
        int temp = -100001;
        for (int up : array) {
            if (temp <= up) {
                temp = up;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет массив на монотонность по убыванию
     * @param array - массив
     * @return - монотонный массив или нет
     */

    private boolean checkLow(int[] array) {
        boolean result = true;
        int temp = 100001;
        for (int low : array) {
            if (temp >= low) {
                temp = low;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
