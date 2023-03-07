package easy;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public Object findFirstChar(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //getOrDefault gives us the value from the map if exists
            // else gives us the default value that we set and here we gave it 0
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
