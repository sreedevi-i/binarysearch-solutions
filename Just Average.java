/* Given a list of integers nums and an integer k, return true if you can remove exactly one element from the list to make the average equal to exactly k.*/
import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
       int avg=0;
        for(int i=0;i<n;i++){
            avg+=nums[i];
            a.add(nums[i]);

        }
      
       if(a.contains(avg- k * (n - 1)))
       return true;
       return false;
    }
}
