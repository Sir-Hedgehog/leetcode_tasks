package ru.twopointer.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 07.10.2020
 */

public class TwoSumTest {
    @Test
    public void whenTwoElectNumbersAreFoundInMiddleOfArrayRecursively() {
        int[] numbers = {10, 25, 75, 150};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForRecursion(numbers, 100);
        int[] expected = {2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoElectNumbersAreFoundInBeginningOfArrayRecursively() {
        int[] numbers = {7, 16, 22, 50};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForRecursion(numbers, 23);
        int[] expected = {1, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoElectNumbersAreFoundInBeginningAndEndOfArrayRecursively() {
        int[] numbers = {2, 3, 4};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForRecursion(numbers, 6);
        int[] expected = {1, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayIsNullRecursively() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForRecursion(null, 6);
        int[] expected = {};
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasOneElementRecursively() {
        int[] numbers = {1};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForRecursion(numbers, 6);
        int[] expected = {};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoElectNumbersAreFoundInMiddleOfArrayIteratively() {
        int[] numbers = {10, 25, 75, 150};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForIterator(numbers, 100);
        int[] expected = {2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoElectNumbersAreFoundInBeginningOfArrayIteratively() {
        int[] numbers = {7, 16, 22, 50};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForIterator(numbers, 23);
        int[] expected = {1, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoElectNumbersAreFoundInBeginningAndEndOfArrayIteratively() {
        int[] numbers = {2, 3, 4};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForIterator(numbers, 6);
        int[] expected = {1, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayIsNullIteratively() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForIterator(null, 6);
        int[] expected = {};
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasOneElementIteratively() {
        int[] numbers = {1};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumForIterator(numbers, 6);
        int[] expected = {};
        assertThat(result, is(expected));
    }
}
