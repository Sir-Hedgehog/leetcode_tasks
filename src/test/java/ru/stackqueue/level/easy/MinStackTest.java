package ru.stackqueue.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.10.2020
 */

public class MinStackTest {
    @Test
    public void getMinElementAfterAddition() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.getMin(), is(1));
    }

    @Test
    public void getMinElementAfterDeletion() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertThat(stack.getMin(), is(2));
    }

    @Test
    public void checkStackMethodOfTop() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.top(), is(3));
    }
}
