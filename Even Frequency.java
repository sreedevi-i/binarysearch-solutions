/* Given a list of integers nums, return whether all numbers appear an even number of times.

This should be done in \mathcal{O}(1)O(1) space.*/
import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(nums[i]))
            {
               h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        n=h.size();
       for (Map.Entry<Integer,Integer> s:h.entrySet())
        {
    
     
        if(   s.getValue()%2!=0)
        return false;
        }
        return true;
    }
}
