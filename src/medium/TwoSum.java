package medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] towSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer n=map.get(nums[i]);
            if(n!=null){
                return  new int[] {n,i};
            }
            map.put(target-nums[i],i);
        }
        return nums;
    }
}
