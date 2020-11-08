package ru.trees.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.11.2020
 */

public class SameTreeTest {
    @Test
    public void checkSameTreesWithTwoBranches() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(true));
    }

    @Test
    public void checkUnequalTreesWithTwoBranches() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }

    @Test
    public void checkSameTreesWithOneBranch() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = null;
        treeNode1.right = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = null;
        treeNode2.right = new TreeNode(2);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(true));
    }

    @Test
    public void checkSameTreesWithOneBranch1() {
        TreeNode treeNode1 = new TreeNode(12);
        treeNode1.left = null;
        treeNode1.right = new TreeNode(-60);
        TreeNode treeNode2 = new TreeNode(12);
        treeNode2.left = null;
        treeNode2.right = new TreeNode(72);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }

    @Test
    public void checkUnequalTreesWithOneBranch2() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = null;
        treeNode1.right = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = null;
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }

    @Test
    public void checkUnequalTrees() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = null;
        treeNode1.right = null;
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }

    @Test
    public void checkSameTreesWithoutRootsAndBranches() {
        TreeNode treeNode1 = null;
        TreeNode treeNode2 = null;
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(true));
    }

    @Test
    public void checkSameTreesWithRootOfZero() {
        TreeNode treeNode1 = new TreeNode(0);
        treeNode1.left = new TreeNode(-5);
        treeNode1.right = null;
        TreeNode treeNode2 = new TreeNode(0);
        treeNode2.left = new TreeNode(-8);
        treeNode2.right = null;
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }

    @Test
    public void checkUnequalTreesWithDeepOfSecondLevel() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = null;
        treeNode1.right = new TreeNode(2);
        treeNode1.right.left = null;
        treeNode1.right.right = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = null;
        treeNode2.right = new TreeNode(2);
        treeNode2.right.left = new TreeNode(3);
        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(treeNode1, treeNode2);
        assertThat(result, is(false));
    }
}
