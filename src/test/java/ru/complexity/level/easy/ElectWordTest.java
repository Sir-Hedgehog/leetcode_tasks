package ru.complexity.level.easy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.01.2021
 */

public class ElectWordTest {

    @Test
    public void findWordEngineer() {
        ElectWord electWord = new ElectWord();
        String[] words = {"job", "engineer", "life"};
        String result = electWord.findWord("1Er42", words);
        assertThat(result, is("engineer"));
    }

    @Test
    public void findWordSteps() {
        ElectWord electWord = new ElectWord();
        String[] words = {"step", "steps", "stripe", "stepple"};
        String result = electWord.findWord("1s3 PSt", words);
        assertThat(result, is("steps"));
    }

    @Test
    public void findWordLetter() {
        ElectWord electWord = new ElectWord();
        String[] words = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
        String result = electWord.findWord("e71752E", words);
        assertThat(result, is("letter"));
    }

    @Test
    public void notFindWord() {
        ElectWord electWord = new ElectWord();
        String[] words = {"suggest", "letter", "husband", "easy", "education", "drug", "sun"};
        String result = electWord.findWord("-71+90", words);
        assertThat(result, is(""));
    }
}
