package ru.strings.level.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountAndSayingTest {

    @Test
    public void whenCountAndSayNumberOne() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(1);
        assertEquals(result, "1");
    }

    @Test
    public void whenCountAndSayNumberThree() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(3);
        assertEquals(result, "21");
    }

    @Test
    public void whenCountAndSayNumberFive() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(5);
        assertEquals(result, "111221");
    }

    @Test
    public void whenCountAndSayNumberSeven() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(7);
        assertEquals(result, "13112221");
    }
}
