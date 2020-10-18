package ru.hashing.level.easy;

import java.util.ArrayList;
import java.util.List;

/*


        Write an algorithm to determine if a number n is "happy".
        A happy number is a number defined by the following process:
        Starting with any positive integer, replace the number by the sum of the squares of its digits,
        and repeat the process until the number equals 1 (where it will stay),
        or it loops endlessly in a cycle which does not include
        1. Those numbers for which this process ends in 1 are happy numbers.
        Return True if n is a happy number, and False if not.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 18.10.2020
 */

public class HappyNumber {
    public boolean certainHappyNumber(int input) {
        List<Integer> story = new ArrayList<>();
        boolean answer = true;
        int previous = 0;
        while (true) {
            int current = (int) Math.pow(input % 10, 2);
            previous = previous + current;
            input /= 10;
            if (input == 0) {
                input = previous;
                if (previous == 1) {
                    break;
                }
                if (story.contains(input)) {
                    answer = false;
                    break;
                } else {
                    story.add(input);
                }
                previous = 0;
            }
        }
        return answer;
    }
}
