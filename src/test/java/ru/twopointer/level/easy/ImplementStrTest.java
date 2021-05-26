package ru.twopointer.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 26.05.2021
 */

public class ImplementStrTest {
    @Test
    public void firstSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("aaa", "a");
        var expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void secondSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("aaa", "aa");
        var expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void thirdSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("mississippi", "issi");
        var expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void fourthSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("pencil", "ci");
        var expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void fifthSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("pen", "n");
        var expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void sixthSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("aaa", "t");
        var expected = -1;
        assertEquals(result, expected);
    }

    @Test
    public void seventhSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("program", "program");
        var expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void eighthSituation() {
        var implement = new ImplementStr();
        var result = implement.implementStr("ada", "da");
        var expected = 1;
        assertEquals(result, expected);
    }
}
