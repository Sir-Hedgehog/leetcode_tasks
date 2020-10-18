package ru.stackqueue.level.easy;

import java.util.*;

/*


        Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        push(x) -- Push element x onto stack.
        pop() -- Removes the element on top of the stack.
        top() -- Get the top element.
        getMin() -- Retrieve the minimum element in the stack.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.10.2020
 */

public class MinStack {
    private int[] array;

    public MinStack() {
        array = new int[0];
    }

    /**
     * Метод добавляет элемент в конец стэка
     * @param input - элемент
     */

    public void push(int input) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = input;
    }

    /**
     * Метод удаляет элемент из конца стэка
     */

    public void pop() {
        array = Arrays.copyOf(array, array.length - 1);
    }

    /**
     * Метод выводит выводит последний элемент из стэка
     * @return - последний элемент из стэка
     */

    public int top() {
        return array[array.length - 1];
    }

    /**
     * Метод находит минимальный по значению элемент в стэке
     * @return - минимальный по значению элемент
     */

    public int getMin() {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}
