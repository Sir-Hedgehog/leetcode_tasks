package ru.graphs.level.easy.convertation;

/*


    Given head which is a reference node to a singly-linked list.
    The value of each node in the linked list is either 0 or 1.
    The linked list holds the binary representation of a number.

    Return the decimal value of the number in the linked list.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 09.01.2021
 */

public class Converting {
    public int getDecimalValue(ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(result.toString(), 2);
    }
}
