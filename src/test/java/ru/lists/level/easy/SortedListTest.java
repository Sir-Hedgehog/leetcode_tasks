package ru.lists.level.easy;

import org.junit.Test;
import ru.lists.level.easy.ListNode;
import ru.lists.level.easy.SortedList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class SortedListTest {
    @Test
    public void whenRealizeChaoticSchemeOfUnSortedListThenGetSortedList() {
        //first listNode
        ListNode thirdNode1 = new ListNode(5, null);
        ListNode secondNode1 = new ListNode(4, thirdNode1);
        ListNode firstNode1 = new ListNode(2, secondNode1);
        //second listNode
        ListNode thirdNode2 = new ListNode(6, null);
        ListNode secondNode2 = new ListNode(3, thirdNode2);
        ListNode firstNode2 = new ListNode(1, secondNode2);
        //expected
        ListNode current = new ListNode(1);
        ListNode expected = current;
        for (int index = 2; index < 7; index++) {
            current.next = new ListNode(index);
            current = current.next;
        }
        String expectedString = expected.toString();
        //original
        SortedList sortedList = new SortedList();
        String originalString = sortedList.mergeTwoLists(firstNode1, firstNode2).toString();
        assertThat(originalString, is(expectedString));
    }

    @Test
    public void whenInColumnsOfFirstListValuesAreMoreThanInSecondThenGetSortedList() {
        //first listNode
        ListNode thirdNode1 = new ListNode(6, null);
        ListNode secondNode1 = new ListNode(5, thirdNode1);
        ListNode firstNode1 = new ListNode(4, secondNode1);
        //second listNode
        ListNode thirdNode2 = new ListNode(3, null);
        ListNode secondNode2 = new ListNode(2, thirdNode2);
        ListNode firstNode2 = new ListNode(1, secondNode2);
        //expected
        ListNode current = new ListNode(1);
        ListNode expected = current;
        for (int index = 2; index < 7; index++) {
            current.next = new ListNode(index);
            current = current.next;
        }
        String expectedString = expected.toString();
        //original
        SortedList sortedList = new SortedList();
        String originalString = sortedList.mergeTwoLists(firstNode1, firstNode2).toString();
        assertThat(originalString, is(expectedString));
    }

    @Test
    public void whenInColumnsOfSecondListValuesAreMoreThanInFirstThenGetSortedList() {
        //first listNode
        ListNode thirdNode1 = new ListNode(3, null);
        ListNode secondNode1 = new ListNode(2, thirdNode1);
        ListNode firstNode1 = new ListNode(1, secondNode1);
        //second listNode
        ListNode thirdNode2 = new ListNode(6, null);
        ListNode secondNode2 = new ListNode(5, thirdNode2);
        ListNode firstNode2 = new ListNode(4, secondNode2);
        //expected
        ListNode current = new ListNode(1);
        ListNode expected = current;
        for (int index = 2; index < 7; index++) {
            current.next = new ListNode(index);
            current = current.next;
        }
        String expectedString = expected.toString();
        //original
        SortedList sortedList = new SortedList();
        String originalString = sortedList.mergeTwoLists(firstNode1, firstNode2).toString();
        assertThat(originalString, is(expectedString));
    }

    @Test
    public void whenThereAreEqualValuesThenGetSortedList() {
        //first listNode
        ListNode thirdNode1 = new ListNode(4, null);
        ListNode secondNode1 = new ListNode(2, thirdNode1);
        ListNode firstNode1 = new ListNode(1, secondNode1);
        //second listNode
        ListNode thirdNode2 = new ListNode(4, null);
        ListNode secondNode2 = new ListNode(3, thirdNode2);
        ListNode firstNode2 = new ListNode(1, secondNode2);
        //expected
        ListNode current = new ListNode(1);
        ListNode expected = current;
        for (int index = 1; index <= 5; index++) {
            if (index == 5) {
                current.next = new ListNode(index - 1);
            } else {
                current.next = new ListNode(index);
            }
            current = current.next;
        }
        String expectedString = expected.toString();
        //original
        SortedList sortedList = new SortedList();
        String originalString = sortedList.mergeTwoLists(firstNode1, firstNode2).toString();
        assertThat(originalString, is(expectedString));
    }
}
