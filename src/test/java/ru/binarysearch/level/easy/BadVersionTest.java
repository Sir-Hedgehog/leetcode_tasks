package ru.binarysearch.level.easy;

import org.junit.Test;
import ru.birarysearch.level.easy.BadVersion;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.03.2021
 */

public class BadVersionTest {
    @Test
    public void findBadVersionForSizeOfOne() {
        final int size = 1;
        BadVersion version = new BadVersion(size);
        int result = version.findBadVersion(size);
        int expect = version.getFirstBadVersion();
        assertEquals(expect, result);
    }

    @Test
    public void findBadVersionForOddNumber() {
        final int size = 5;
        BadVersion version = new BadVersion(size);
        int result = version.findBadVersion(size);
        int expect = version.getFirstBadVersion();
        assertEquals(expect, result);
    }

    @Test
    public void findBadVersionForEvenNumber() {
        final int size = 20;
        BadVersion version = new BadVersion(size);
        int result = version.findBadVersion(size);
        int expect = version.getFirstBadVersion();
        assertEquals(expect, result);
    }

    @Test
    public void findBadVersionForBigNumber() {
        final int size = 2126753390;
        BadVersion version = new BadVersion(size);
        int result = version.findBadVersion(size);
        int expect = version.getFirstBadVersion();
        assertEquals(expect, result);
    }
}
