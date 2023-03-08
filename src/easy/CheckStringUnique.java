package easy;

import java.util.HashMap;
import java.util.Map;

public class CheckStringUnique {
    public boolean check(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                return false;
            }
            else{
                map.put(c,i);
            }
        }
        return true;
    }
}
