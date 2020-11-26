package ru.greedy.level.easy;

import java.util.*;
import java.util.stream.Collectors;

/*


        122. Best Time to Buy and Sell Stock II

        Say you have an array prices for which the ith element is the price of a given stock on day i.

        Design an algorithm to find the maximum profit.
        You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

        Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 25.11.2020
 */

public class BestTime {

    public int getMaxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public int getMaxProfit2(int[] prices) {
        int result = 0;
        LinkedList<Integer> list;
        if (prices.length > 1) {
            list = Arrays.stream(prices).boxed().collect(Collectors.toCollection(LinkedList::new));
        } else {
            return 0;
        }
        Integer firstElement = list.poll();
        Integer secondElement = list.peek();
        if (firstElement < secondElement && list.size() == 1) {
            return secondElement - firstElement;
        }
        while (!list.isEmpty()) {
            if (firstElement < secondElement) {
                for (int index = 1; index < list.size(); index++) {
                    if (secondElement > list.get(index)) {
                        result = secondElement - firstElement + result;
                        list = new LinkedList<>(list.subList(index, list.size()));
                        break;
                    }
                    if ((index + 1 < list.size() && list.get(index) > list.get(index + 1)) || index + 1 >= list.size()) {
                        result = list.get(index) - firstElement + result;
                        list = new LinkedList<>(list.subList(index + 1, list.size()));
                        break;
                    } else {
                        list.remove(--index);
                    }
                }
            }
            if (list.size() == 1 && secondElement.equals(list.get(0)) && firstElement < secondElement) {
                result = secondElement - firstElement + result;
            }
            firstElement = list.poll();
            secondElement = list.peek();
        }
        if (result < 0) {
            result = 0;
        }
        return result;
    }
}
