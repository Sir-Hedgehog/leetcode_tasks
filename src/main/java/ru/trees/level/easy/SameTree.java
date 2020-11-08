package ru.trees.level.easy;

import java.util.*;

/*


       Given two binary trees, write a function to check if they are the same or not.

       Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.11.2020
 */

public class SameTree {

    public boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {
        List<Integer> list1 = this.formListOfTreeElements(treeNode1);
        List<Integer> list2 = this.formListOfTreeElements(treeNode2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int index = 0; index < list1.size(); index++) {
            if (list1.get(index).intValue() != list2.get(index).intValue()) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> formListOfTreeElements(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            list.add(-1);
            return list;
        }
        do {
            if (!queue.isEmpty()) {
                root = queue.poll();
            }
            if (root.val != -1) {
                queue.add(Objects.requireNonNullElseGet(root.left, () -> new TreeNode(-1)));
                queue.add(Objects.requireNonNullElseGet(root.right, () -> new TreeNode(-1)));
            }
            list.add(root.val);
        } while (!queue.isEmpty());
        return list;
    }
}
