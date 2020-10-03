package ru.arrays.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class RotateArrayTest {
    @Test
    public void whenRotateOfZeroNumbers() {
        RotateArray array = new RotateArray();
        int[] original = {0, 1};
        int[] expected = {0, 1};
        assertThat(array.rotate(original, 0), is(expected));
    }

    @Test
    public void whenRotateOfTwoNumbers() {
        RotateArray array = new RotateArray();
        int[] original = {10, 9, 255};
        int[] expected = {9, 255, 10};
        assertThat(array.rotate(original, 2), is(expected));
    }

    @Test
    public void whenRotateOfFourNumbers() {
        RotateArray array = new RotateArray();
        int[] original = {0, 1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 0};
        assertThat(array.rotate(original, 4), is(expected));
    }
}
