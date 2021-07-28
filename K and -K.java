/* Given a list of integers nums, return the largest integer k where k and -k both exist in nums (they can be the same integer). If there's no such integer, return -1.*/
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<Integer>();
int m=-1;
        for(int i=0;i<n;i++){
            h.add(nums[i]);
            if(h.contains(-1*(nums[i])))
           m = Math.max(m, Math.abs(nums[i]));
        }
        return m;

        
    }
}
