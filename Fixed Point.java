/* Given a list of unique integers nums sorted in ascending order, return the minimum i such that nums[i] == i. If there's no solution, return -1.*/
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==i)
            {
                ind=i;
                break;
            }
        }
        return ind;
    }
}
