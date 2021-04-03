package ru.bitmanipulation.level.easy;

import java.util.HashMap;
import java.util.Map;

/*


        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.04.2021
 */

public class SingleNumber {

    public int singleNumber(int[] numbers) {

        var start = 1;
        Map<Integer, Integer> store = new HashMap<>();

        for (int number : numbers) {
            if (!store.containsKey(number)) {
                store.put(number, start);
            } else {
                int value = store.get(number);
                store.put(number, ++value);
            }
        }

        if (!store.containsValue(start)) {
            return 0;
        } else {
            return store
                    .entrySet()
                    .stream()
                    .filter(element -> element.getValue() == start)
                    .findFirst()
                    .get()
                    .getKey();
        }
    }
}
