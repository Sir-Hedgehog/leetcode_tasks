package ru.bit_manipulation.level.easy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 07.10.2020
 */

public class NumberOfOneBitsTest {
    @Test
    public void checkQuantityOfThreeUnits() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        int result = numberOfOneBits.getNumberOfOneBits(00000000000000000000000000001011);
        assertThat(result, is(3));
    }

    @Test
    public void checkQuantityOfOneUnit() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        int result = numberOfOneBits.getNumberOfOneBits(00000000000000000000000010000000);
        assertThat(result, is(1));
    }

    @Test
    public void checkQuantityOfNineUnits() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        int result = numberOfOneBits.getNumberOfOneBits(011110111101);
        assertThat(result, is(9));
    }
}
