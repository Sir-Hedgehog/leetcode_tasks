package ru.strings.level.easy;

/*


        The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
        countAndSay(1) = "1"
        countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
        which is then converted into a different digit string.
        To determine how you "say" a digit string,
        split it into the minimal number of groups so that each group is a contiguous section all of the same character.
        Then for each group, say the number of characters, then say the character.

        To convert the saying into a digit string, replace the counts with a number and concatenate every saying.


 */

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSaying {

    public String countAndSay(int number) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder stringNumber = new StringBuilder("1");
        char current = '1';
        if (number == 1) {
            return stringNumber.toString();
        }
        for (int index = 1; index < number; index++) {
            char[] chars = stringNumber.toString().toCharArray();
            stringNumber = new StringBuilder();
            for (char element : chars) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1);
                } else {
                    if (!map.isEmpty()) {
                        stringNumber.append(map.get(current)).append(current);
                        map.clear();
                    }
                    map.put(element, 1);
                }
                current = element;
            }
            stringNumber.append(map.get(current)).append(current);
            map.clear();
        }
        return stringNumber.toString();
    }
}
