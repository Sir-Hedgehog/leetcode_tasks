package ru.bit_manipulation.level.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.04.2021
 */

public class SingleNumberTest {

    @Test
    public void whenFirstNumberIsElectUsingTotalOfFive() {
        var number = new SingleNumber();
        int[] numbers = {4, 1, 2, 1, 2};
        final var result = 4;
        var except = number.singleNumber(numbers);
        assertEquals(result, except);
    }

    @Test
    public void whenLastNumberUsingTotalOfThree() {
        var number = new SingleNumber();
        int[] numbers = {2, 2, 1};
        final var result = 1;
        var except = number.singleNumber(numbers);
        assertEquals(result, except);
    }

    @Test
    public void whenAllElementsHaveDublicates() {
        var number = new SingleNumber();
        int[] numbers = {2, 2, 7, 7, 25, 25};
        final var result = 0;
        var except = number.singleNumber(numbers);
        assertEquals(result, except);
    }
}
