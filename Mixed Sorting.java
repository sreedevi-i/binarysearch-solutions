/*Given a list of integers nums, sort the array such that:

All even numbers are sorted in increasing order
All odd numbers are sorted in decreasing order
The relative positions of the even and odd numbers remain the same*/
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
            even.add(nums[i]);
            else
            odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int j=0,k=odd.size()-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
            {
                nums[i]=even.get(j);
                j+=1;
            }else{
                nums[i]=odd.get(k);
                k-=1;
            }
        }
        return nums;
    }
}
