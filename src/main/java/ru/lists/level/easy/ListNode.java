package ru.lists.level.easy;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.10.2020
 */

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" + "value=" + value + ", next=" + next + '}';
    }
}
