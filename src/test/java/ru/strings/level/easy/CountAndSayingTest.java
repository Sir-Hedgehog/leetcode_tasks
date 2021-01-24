package ru.strings.level.easy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountAndSayingTest {

    @Test
    public void whenCountAndSayNumberOne() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(1);
        assertThat(result, is("1"));
    }

    @Test
    public void whenCountAndSayNumberThree() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(3);
        assertThat(result, is("21"));
    }

    @Test
    public void whenCountAndSayNumberFive() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(5);
        assertThat(result, is("111221"));
    }

    @Test
    public void whenCountAndSayNumberSeven() {
        CountAndSaying countAndSaying = new CountAndSaying();
        String result = countAndSaying.countAndSay(7);
        assertThat(result, is("13112221"));
    }
}
