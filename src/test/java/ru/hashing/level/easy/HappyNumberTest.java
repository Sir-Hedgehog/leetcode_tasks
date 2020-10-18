package ru.hashing.level.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 18.10.2020
 */

public class HappyNumberTest {

    @Test
    public void whenWeUseDifficultHappyNumberThenGetTrue() {
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.certainHappyNumber(19);
        assertThat(result, is(true));
    }

    @Test
    public void whenWeUseSimpleHappyNumberThenGetTrue() {
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.certainHappyNumber(100);
        assertThat(result, is(true));
    }

    @Test
    public void whenWeUseDifficultUnHappyNumberThenGetTrue() {
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.certainHappyNumber(59);
        assertThat(result, is(false));
    }

    @Test
    public void whenWeUseSimpleUnHappyNumberThenGetTrue() {
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.certainHappyNumber(0);
        assertThat(result, is(false));
    }
}

