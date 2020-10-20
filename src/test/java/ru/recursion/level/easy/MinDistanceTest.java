package ru.recursion.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 20.10.2020
 */

public class MinDistanceTest {

    @Test
    public void checkGettingOfMinDifferenceWithFirstDeepLevelInLeftBranches() {
        TreeNode node1 = new TreeNode(63);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2, node1, node2);
        TreeNode node4 = new TreeNode(6);
        TreeNode rootNode = new TreeNode(90, node3, node4);
        MinDistance distance = new MinDistance();
        int result = distance.getMinDifference1(rootNode);
        assertThat(result, is(1));
    }

    @Test
    public void checkGettingOfMinDifferenceWithSecondDeepLevelInLeftBranches() {
        TreeNode node1 = new TreeNode(63);
        TreeNode node2 = new TreeNode(89);
        TreeNode node3 = new TreeNode(2, node1, node2);
        TreeNode node4 = new TreeNode(6);
        TreeNode rootNode = new TreeNode(90, node3, node4);
        MinDistance distance = new MinDistance();
        int result = distance.getMinDifference2(rootNode);
        assertThat(result, is(1));
    }
}
