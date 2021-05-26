package ru.twopointer.level.easy;

/**
 *
 * 28. Implement strStr()
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 26.05.2021
 */

public class ImplementStr {

    public int implementStr(String haystack, String needle) {
        var out = -1;
        var in = -1;
        var heap = new StringBuilder();
        var size = haystack.length();

        if (needle.isBlank()) {
            return 0;
        }

        while (haystack.contains(needle)) {
            heap.append(haystack.charAt(0));
            haystack = haystack.substring(1);
            ++out;
            if (heap.toString().contains(needle) && heap.length() != size) {
                while (heap.toString().contains(needle)) {
                    heap = new StringBuilder(heap.substring(1));
                    ++in;
                }
                return in;
            }
        }

        return out;
    }
}
