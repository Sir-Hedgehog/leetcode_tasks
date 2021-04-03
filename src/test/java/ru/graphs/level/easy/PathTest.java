package ru.graphs.level.easy;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 09.01.2021
 */

public class PathTest {
    @Test
    public void whenConsistentPath() {
        Path path = new Path();
        String destination = path.getDestination(
                List.of(
                        List.of("Tallinn", "Moscow"),
                        List.of("Moscow", "Milan"),
                        List.of("Milan", "Paris")
                )
        );
        assertEquals(destination, "Paris");
    }

    @Test
    public void whenNotConsistentPath() {
        Path path = new Path();
        String destination = path.getDestination(
                List.of(
                        List.of("Zagreb", "London"),
                        List.of("New York", "Kiev"),
                        List.of("London", "New York")
                )
        );
        assertEquals(destination, "Kiev");
    }
}
