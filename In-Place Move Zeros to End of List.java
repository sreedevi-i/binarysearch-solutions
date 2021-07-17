/* Given a list of integers nums, put all the zeros to the back of the list by modifying the list in-place. The relative ordering of other elements should stay the same.*/
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
     int n=nums.length;
     if(n==1)
     return nums;
     int count=0;
     for(int i=0;i<n;i++)
     {
         if(nums[i]!=0)
         nums[count++]=nums[i];

     }
      while (count < n)
            nums[count++] = 0;
     return nums;
    }
}
