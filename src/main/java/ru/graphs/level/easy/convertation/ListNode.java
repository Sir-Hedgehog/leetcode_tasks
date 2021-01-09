package ru.graphs.level.easy.convertation;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 09.01.2021
 */

public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
