package ru.recursion.level.easy;

/*


    Given a Binary Search Tree (BST) with the root node root,
    return the minimum difference between the values of any two different nodes in the tree.

    Note:
        1) The size of the BST will be between 2 and 100.
        2) The BST is always valid, each node's value is an integer, and each node's value is different.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 20.10.2020
 */

public class MinDistance {
    private int min = Integer.MAX_VALUE;
    private int prev;

    /**
     * Метод находит минимальную разность между узлами дерева с максимальным уровнем глубины в 2 единицы
     * @param root - корень дерева
     * @return - минимальная разность между узлами дерева с максимальным уровнем глубины в 2 единицы
     */

    public int getMinDifference2(TreeNode root) {
        prev = -1;
        checkNodes(root);
        return min;
    }

    /**
     * Метод проверяет минимальную разность между узлами
     * @param node - узел
     */

    private void checkNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        checkNodes(node.left);
        if (prev != -1) {
            min = Math.min(min, Math.abs(prev - node.value));
        }
        prev = node.value;
        checkNodes(node.right);
    }

    /**
     * Метод находит минимальную разность между узлами дерева с максимальным уровнем глубины в 1 единицу
     * @param root - корень дерева
     * @return - минимальная разность между узлами дерева с максимальным уровнем глубины в 1 единицу
     */

    public int getMinDifference1(TreeNode root) {
        int result = Integer.MAX_VALUE;
        int branch;
        if (root.left != null) {
            branch = Math.abs(root.value - root.left.value);
            result = Math.min(result, branch);
        }
        if (root.right != null) {
            branch = Math.abs(root.value - root.right.value);
            result = Math.min(result, branch);
        }
        if (root.left != null) {
            result = Math.min(result, getMinDifference1(root.left));
        }
        if (root.right != null) {
            result = Math.min(result, getMinDifference1(root.right));
        }
        return result;
    }
}
