/* You are given a list of integers nums where each integer occurs exactly three times except for one which occurs once. Return the lone integer.*/
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
           if(h.containsKey(nums[i]))
           h.put(nums[i],h.get(nums[i])+1);
           else
           h.put(nums[i],1);
       }
  
       int v=0;
       for (Map.Entry mapElement : h.entrySet()) {
           int k=(int)mapElement.getValue();
           if(k!=3)
           v=((int)mapElement.getKey());
       }
           return v;
     // return 1;
        
    }
}
