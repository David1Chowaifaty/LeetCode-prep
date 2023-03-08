package easy;

import java.util.Arrays;

public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0) return "";
            else if(strs.length == 1) return strs[0];
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int i=0;
            while(i<s1.length()){
                if(s1.charAt(i)==s2.charAt(i)){
                    i++;
                }
                else{
                    break;
                }
            }
            return s1.substring(0,i);
        }
    }

