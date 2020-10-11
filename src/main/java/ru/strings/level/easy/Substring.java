package ru.strings.level.easy;

import java.util.*;

/*


        Given an array of string words. Return all strings in words which is substring of another word in any order.
        String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.10.2020
 */

public class Substring {

    /**
     * Метод формирует список строк, которые являются частью строк, входящих в заданный массив
     * @param words - входящий массив
     * @return - результирующий список
     */

    public List<String> getSubstring(String[] words) {
        if (words == null) {
            return new ArrayList<>();
        }
        ArrayDeque<String> queue = new ArrayDeque<>(Arrays.asList(words));
        Set<String> set = new HashSet<>();
        for (String wordOfArray : words) {
            String current = queue.pollFirst();
            for (String stringOfQueue : queue) {
                if (wordOfArray.contains(stringOfQueue)) {
                    set.add(stringOfQueue);
                }
            }
            if (current != null) {
                queue.addLast(current);
            }
        }
        return new ArrayList<>(set);
    }
}
