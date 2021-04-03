package ru.strings.level.easy;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.10.2020
 */

public class SubStringTest {
    @Test
    public void checkSubstringForManyElements() {
        Substring substring = new Substring();
        String[] words = {"lite", "spliterator", "split", "Mars", "JOOQ", "element", "gener", "generator"};
        List<String> result = substring.getSubstring(words);
        List<String> expect = List.of("split", "gener", "lite");
        assertEquals(result, expect);
    }

    @Test
    public void checkSubstringForTwoElements() {
        Substring substring = new Substring();
        String[] words = {"lite", "spliterator"};
        List<String> result = substring.getSubstring(words);
        List<String> expect = List.of("lite");
        assertEquals(result, expect);
    }

    @Test
    public void checkSubstringForOneElement() {
        Substring substring = new Substring();
        String[] words = {"lite"};
        List<String> result = substring.getSubstring(words);
        List<String> expect = List.of();
        assertEquals(result, expect);
    }
}
