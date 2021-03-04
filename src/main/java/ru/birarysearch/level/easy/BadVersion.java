package ru.birarysearch.level.easy;

import java.util.Random;

/*

        You are a product manager and currently leading a team to develop a new product.
        Unfortunately, the latest version of your product fails the quality check.
        Since each version is developed based on the previous version, all the versions after a bad version are also bad.
        Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
        which causes all the following ones to be bad.
        You are given an API bool isBadVersion(version) which returns whether version is bad.
        Implement a function to find the first bad version. You should minimize the number of calls to the API.

*/

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.03.2021
 */

public class BadVersion {
    private final int firstBadVersion;

    public BadVersion(int size) {
        firstBadVersion = getFirstBadVersion(size);
    }

    /**
     * This method finds the first bad version of project
     * @param size - basic count of project versions
     * @return - first bad version
     */

    public int findBadVersion(int size) {
        long current = 1;

        while (current <= size) {
            long middle = (size + current) / 2;
            if (!isBadVersion((int) middle)) {
                current = middle + 1;
            } else if (isBadVersion((int) middle)) {
                if (!isBadVersion((int) (middle - 1))) {
                    return (int) middle;
                }
                size = (int) (middle - 1);
            }
        }

        return (int) current;
    }

    /**
     * This method check specific version on correct
     * @param version - version
     * @return - good or bad
     */

    private boolean isBadVersion(int version) {
        return firstBadVersion <= version;
    }

    /**
     * This method generates first bad version
     * @param size - count of versions
     * @return - first bad version
     */

    private int getFirstBadVersion(int size) {
        if (size == 1) {
            return 1;
        }
        return new Random().ints(1, size).findFirst().getAsInt();
    }

    public int getFirstBadVersion() {
        return firstBadVersion;
    }
}
