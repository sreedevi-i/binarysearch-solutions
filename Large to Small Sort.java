/* Given a list of integers nums, sort the list in the following way:

First number is the maximum
Second number is the minimum
Third number is the 2nd maximum
Fourth number is the 2nd minimum
And so on*/
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums;
        Arrays.sort(nums);
        int j=n-1;
        ArrayList<Integer> a=new ArrayList<Integer>(n);
       for(int i=0;i<=j;i++){
           a.add(nums[j]);
           a.add(nums[i]);
           j--;
       }
       for(int i=0;i<n;i++)
       nums[i]=a.get(i);

       return nums;
        
    }
}
