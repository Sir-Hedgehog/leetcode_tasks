package ru.heapmap.level.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*


        We have a collection of stones, each stone has a positive integer weight.

        Each turn, we choose the two heaviest stones and smash them together.
        Suppose the stones have weights x and y with x <= y.  The result of this smash is:

        If x == y, both stones are totally destroyed;
        If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
        At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.10.2020
 */

public class StoneWeight {
    public int getWinnerStone(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        while (stack.size() != 1) {
            Collections.sort(stack);
            int newStone = stack.pop() - stack.pop();
            if (stack.isEmpty() || newStone != 0) {
                stack.add(newStone);
            }
        }
        return stack.get(0);
    }
}
