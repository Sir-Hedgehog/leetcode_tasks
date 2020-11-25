package ru.greedy.level.easy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 25.11.2020
 */

public class BestTimeTest {

    @Test
    public void checkProfitableStocksForThreeElements() {
        BestTime bestTime = new BestTime();
        int[] input = {2, 1, 4};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(3));
    }

    @Test
    public void checkProfitableStocksForFourElements() {
        BestTime bestTime = new BestTime();
        int[] input = {7, 6, 5, 4};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(0));
    }

    @Test
    public void checkProfitableStocksForFourElements2() {
        BestTime bestTime = new BestTime();
        int[] input = {1, 2, 4, 7};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(6));
    }

    @Test
    public void checkProfitableStocksForFourElements3() {
        BestTime bestTime = new BestTime();
        int[] input = {1, 7, 4, 2};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(6));
    }

    @Test
    public void checkProfitableStocksForFiveElements() {
        BestTime bestTime = new BestTime();
        int[] input = {1, 2, 3, 4, 5};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(4));
    }

    @Test
    public void checkProfitableStocksForFiveElements2() {
        BestTime bestTime = new BestTime();
        int[] input = {2, 1, 2, 0, 1};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(2));
    }

    @Test
    public void checkProfitableStocksForSixElements() {
        BestTime bestTime = new BestTime();
        int[] input = {7, 1, 5, 3, 6, 4};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(7));
    }

    @Test
    public void checkProfitableStocksForSixElements2() {
        BestTime bestTime = new BestTime();
        int[] input = {6, 1, 3, 2, 4, 7};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(7));
    }

    @Test
    public void checkProfitableStocksForSevenElements() {
        BestTime bestTime = new BestTime();
        int[] input = {2, 1, 4, 5, 2, 9, 7};
        int result = bestTime.getMaxProfit(input);
        assertThat(result, is(11));
    }
}
