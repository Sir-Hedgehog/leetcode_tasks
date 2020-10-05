package ru.binarysearch.level.easy;

import org.junit.Test;
import ru.birarysearch.level.easy.MaxCountOfElements;
import ru.birarysearch.level.easy.TreeNode;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class MaxCountOfElementsTest {
    @Test
    public void checkOnOneMode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        MaxCountOfElements maxCountOfElements = new MaxCountOfElements();
        int[] result = maxCountOfElements.findMode(treeNode);
        int[] expected = {2};
        assertThat(result, is(expected));
    }

    @Test
    public void checkOnTwoModes() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        treeNode.right = new TreeNode(2);
        MaxCountOfElements maxCountOfElements = new MaxCountOfElements();
        int[] result = maxCountOfElements.findMode(treeNode);
        int[] expected = {1, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void checkOnSomeModes() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = null;
        treeNode.right = new TreeNode(3);
        treeNode.right.left = null;
        treeNode.right.right = new TreeNode(4);
        MaxCountOfElements maxCountOfElements = new MaxCountOfElements();
        int[] result = maxCountOfElements.findMode(treeNode);
        int[] expected = {2, 3, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void checkOnRootEqualsNull() {
        TreeNode treeNode = null;
        MaxCountOfElements maxCountOfElements = new MaxCountOfElements();
        int[] result = maxCountOfElements.findMode(treeNode);
        int[] expected = {};
        assertThat(result, is(expected));
    }
}
