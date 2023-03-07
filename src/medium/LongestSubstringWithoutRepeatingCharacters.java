package medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(maxLength, left + 1);
            }
            map.put(c, i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
