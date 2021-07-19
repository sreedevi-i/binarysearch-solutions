/* Given a list of integers nums, return whether it represents a max heap. That is, for every i we have that:

nums[i] ≥ nums[2*i + 1] if 2*i + 1 is within bounds
nums[i] ≥ nums[2*i + 2] if 2*i + 2 is within bounds*/
import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int n=nums.length;
        if(n==1)
        return true;
        for(int i=0;i<n;i++){
            if(2*i+1<n ){
                if(nums[i]>=nums[(2*i)+1])
                {

                }
                else{
                  
                return false;
            }
            if(2*i+2<n)
            {
                 if(nums[i]>=nums[2*i+2]);
                 else  return false;
            }
        } }
        return true;
        
    }
}
