package medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int maxLength = 0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(m.containsKey(c)){
                left = Math.max(left, m.get(c));
            }

            m.put(c,i);

            maxLength = Math.max(maxLength, i - left );
            System.out.println("max"+maxLength);
        }
        System.out.println(m);
        return maxLength;
    }
}
