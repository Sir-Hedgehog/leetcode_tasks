package ru.complexity.level.easy;

import java.util.*;

/*

    Given a string licensePlate and an array of strings words, find the shortest completing word in words.

    A completing word is a word that contains all the letters in licensePlate.
    Ignore numbers and spaces in licensePlate, and treat letters as case insensitive.
    If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.

    For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
    Possible completing words are "abccdef", "caaacab", and "cbca".

    Return the shortest completing word in words. It is guaranteed an answer exists.
    If there are multiple shortest completing words, return the first one that occurs in words.

 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.01.2021
 */

public class ElectWord {

    public String findWord(String licensePlate, String[] words) {
        List<String> resultList = new ArrayList<>();

        char[] filter = licensePlate.toLowerCase().replaceAll("[^a-z]", "").toCharArray();

        if (filter.length == 0) {
            return "";
        }

        for (String word : words) {
            int counter = 0;
            String current = word;
            for (char letter : filter) {
                String converted = Character.toString(letter);
                if (current.contains(converted)) {
                    current = current.replaceFirst(converted, "");
                    ++counter;
                }
            }

            if (counter == filter.length) {
                resultList.add(word);
            }
        }

        return resultList.stream().min(Comparator.comparing(String::length)).orElse("");
    }
}
