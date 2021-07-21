import java.util.*;

class Solution {
    public int[] solve(int[] nums, int k) {
        int n=nums.length;
        int[] t=new int[k];

        for(int i=0;i<k;i++){
        t[i]=nums[i];
        //System.out.println(t[i]);
        }
        for(int i=0;i<n-k;i++)
        nums[i]=nums[i+k];
        for(int i=n-k,j=0;i<n && j<k;i++,j++)
        nums[i]=t[j];
        return nums;
    }
}
