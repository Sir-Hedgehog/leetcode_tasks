package ru.lists.level.easy;

/*


    Merge two sorted linked lists and return it as a new sorted list.
    The new list should be made by splicing together the nodes of the first two lists.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.10.2020
 */

public class SortedList {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode current = new ListNode();
        ListNode head = current;
        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                current.next = node1;
                node1 = node1.next;
                current = current.next;
            } else {
                current.next = node2;
                node2 = node2.next;
                current = current.next;
            }
        }
        if (node1 == null) {
            current.next = node2;
        } else {
            current.next = node1;
        }
        return head.next;
    }
}
