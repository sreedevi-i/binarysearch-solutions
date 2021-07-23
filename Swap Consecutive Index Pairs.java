import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int n=nums.length;
        boolean[] b=new boolean[n];
        Arrays.fill(b,false);
        for(int i=0;i<n;i++){
            if(i%2==0 && i+2<n&& b[i]==false && b[i+2]==false)
            {
                int t=nums[i];
                nums[i]=nums[i+2];
                nums[i+2]=t;
                b[i]=true;
                b[i+2]=true;
            }
            else if(i%2!=0 && i+2<n && b[i]==false && b[i+2]==false){
                int t=nums[i];
                nums[i]=nums[i+2];
                nums[i+2]=t;
                 b[i]=true;
                b[i+2]=true;

            }
        }
        return nums;
        
    }
}
