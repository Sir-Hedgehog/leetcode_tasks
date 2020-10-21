package ru.heapmap.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.10.2020
 */

public class StoneWeightTest {

    @Test
    public void realizeSituationOfStoneAbsent() {
        StoneWeight stoneWeight = new StoneWeight();
        int[] stones = {1, 5, 3, 4, 1};
        int result = stoneWeight.getWinnerStone(stones);
        assertThat(result, is(0));
    }

    @Test
    public void realizeSituationOfOneStoneWhichHasValueOf1() {
        StoneWeight stoneWeight = new StoneWeight();
        int[] stones = {2, 7, 4, 1, 8, 1};
        int result = stoneWeight.getWinnerStone(stones);
        assertThat(result, is(1));
    }

    @Test
    public void realizeSituationOfOneStoneWhichHasValueOf7() {
        StoneWeight stoneWeight = new StoneWeight();
        int[] stones = {2, 1, 3, 1, 15, 1};
        int result = stoneWeight.getWinnerStone(stones);
        assertThat(result, is(7));
    }
}
