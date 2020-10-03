package ru.arrays.level.easy;

/*

        An array is monotonic if it is either monotone increasing or monotone decreasing.
        An array A is monotone increasing if for all i <= j, A[i] <= A[j].
        An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
        Return true if and only if the given array A is monotonic.

*/

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.09.2020
 */

public class MonotonicArray {
    public boolean isMonotonic(int[] array) {
        return checkLow(array) || checkUp(array);
    }

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
