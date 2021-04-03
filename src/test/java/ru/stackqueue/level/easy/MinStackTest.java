package ru.stackqueue.level.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        assertEquals(stack.getMin(), 1);
    }

    @Test
    public void getMinElementAfterDeletion() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertEquals(stack.getMin(), 2);
    }

    @Test
    public void checkStackMethodOfTop() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.top(), 3);
    }
}
