package ru.birarysearch.level.easy;

import java.util.*;

/*


        Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
        Assume a BST is defined as follows:
        1) The left subtree of a node contains only nodes with keys less than or equal to the node's key.
        2) The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
        3) Both the left and right subtrees must also be binary search trees.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class MaxCountOfElements {

    /**
     * Метод с помощью очереди формирует список значений бинарного дерева и находит числа с максимальным количеством дубликатов
     * @param root - корень дерева
     * @return - массив чисел с максимальным количеством дубликатов
     */

    public int[] findMode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        do {
            if (root == null) {
                return new int[0];
            }
            if (!queue.isEmpty()) {
                root = queue.poll();
            }
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
            list.add(root.value);
        } while (!queue.isEmpty());
        return searchMaxDuplicate(list);
    }

    /**
     * Метод находит числа с максимальным количеством дубликатов
     * @param input - список чисел исходного бинарного дерева
     * @return - массив чисел с максимальным количеством дубликатов
     */

    private int[] searchMaxDuplicate(List<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> current = new ArrayList<>();
        for (Integer element : input) {
            Integer value = map.get(element);
            map.put(element, value == null ? 1 : value + 1);
        }
        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (element.getValue().equals(max)) {
                current.add(element.getKey());
            }
        }
        return current.stream().mapToInt(number -> number).toArray();
    }
}
