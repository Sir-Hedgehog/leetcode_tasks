package ru.complexity;

import org.junit.Test;
import ru.complexity.level.easy.Complement;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class ComplementTest {
    @Test
    public void whenRealizeBitwiseComplementOf11ThenGet4() {
        Complement complement = new Complement();
        int original = complement.bitwiseComplement(11);
        assertThat(original, is(4));
    }

    @Test
    public void whenRealizeBitwiseComplementOf1ThenGet0() {
        Complement complement = new Complement();
        int original = complement.bitwiseComplement(1);
        assertThat(original, is(0));
    }
}
