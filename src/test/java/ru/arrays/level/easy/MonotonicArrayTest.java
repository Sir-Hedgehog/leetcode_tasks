package ru.arrays.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class MonotonicArrayTest {
    @Test
    public void whenMonotonicUpwardMovementThenTrue() {
        MonotonicArray array = new MonotonicArray();
        int[] numbers = {1, 2, 2, 3};
        assertThat(array.isMonotonic(numbers), is(true));
    }

    @Test
    public void whenMonotonicDownwardMovementThenTrue() {
        MonotonicArray array = new MonotonicArray();
        int[] numbers = {7, 6, 5, 4};
        assertThat(array.isMonotonic(numbers), is(true));
    }

    @Test
    public void whenRamblingUpwardMovementThenTrue() {
        MonotonicArray array = new MonotonicArray();
        int[] numbers = {0, 1, 0, 5};
        assertThat(array.isMonotonic(numbers), is(false));
    }

    @Test
    public void whenRamblingDownwardMovementThenTrue() {
        MonotonicArray array = new MonotonicArray();
        int[] numbers = {7, 8, 3, 2};
        assertThat(array.isMonotonic(numbers), is(false));
    }
}
