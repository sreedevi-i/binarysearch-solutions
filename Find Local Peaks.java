import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
        if(n>1){
           if(nums[0]>nums[0+1])
           a.add(0); 
        for(int i=1;i<n-1;i++){
           if( nums[i - 1] < nums[i] && nums[i]> nums[i + 1])
           a.add(i);
        }
        if(nums[n-1]>nums[n-2])
        a.add(n-1);
    }
    n=a.size();
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    b[i]=a.get(i);
    return b;
    }
}
