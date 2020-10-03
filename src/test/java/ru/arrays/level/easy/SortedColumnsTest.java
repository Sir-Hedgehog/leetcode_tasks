package ru.arrays.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class SortedColumnsTest {
    @Test
    public void whenAllColumnsAreSortedThenResultIsZero() {
        SortedColumns array = new SortedColumns();
        String[] numbers = {"abc", "def", "ghi"};
        assertThat(array.minDeletionSize(numbers), is(0));
    }

    @Test
    public void whenOneColumnIsNotSortedThenResultIsOne() {
        SortedColumns array = new SortedColumns();
        String[] numbers = {"xabc", "defr", "ghiy"};
        assertThat(array.minDeletionSize(numbers), is(1));
    }

    @Test
    public void whenColumnsAreEmptyThenResultIsZero() {
        SortedColumns array = new SortedColumns();
        String[] numbers = {"", "", ""};
        assertThat(array.minDeletionSize(numbers), is(0));
    }

    @Test
    public void whenAllColumnsAreNotSortedThenResultIsAll() {
        SortedColumns array = new SortedColumns();
        String[] numbers = {"xyz", "hij", "abc"};
        assertThat(array.minDeletionSize(numbers), is(3));
    }
}
