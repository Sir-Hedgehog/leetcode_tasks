package ru.graphs.level.easy.convertation;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 09.01.2021
 */

public class ConvertingTest {

    @Test
    public void whenConvertNumberFive() {
        ListNode node3 = new ListNode(1, null);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(1, node2);
        Converting converting = new Converting();
        int destination = converting.getDecimalValue(node1);
        assertThat(destination, is(5));
    }

    @Test
    public void whenConvertNumberOne() {
        ListNode node = new ListNode(1, null);
        Converting converting = new Converting();
        int destination = converting.getDecimalValue(node);
        assertThat(destination, is(1));
    }

    @Test
    public void whenConvertNumber1FortySix() {
        ListNode node6 = new ListNode(0, null);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(1, node5);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(1, node2);
        Converting converting = new Converting();
        int destination = converting.getDecimalValue(node1);
        assertThat(destination, is(46));
    }

    @Test
    public void whenConvertNumberZero() {
        ListNode node = new ListNode(0, null);
        Converting converting = new Converting();
        int destination = converting.getDecimalValue(node);
        assertThat(destination, is(0));
    }
}
