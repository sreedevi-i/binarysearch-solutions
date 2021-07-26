import java.util.*;
import java.util.Collections;

class Solution {
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        } }
    public int solve(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=nums[i];
        Arrays.sort(a);
        int acost=0,bcost=0;
        for(int i=0;i<n;i++){
            if(a[i]!=nums[i])
            acost+=Math.abs(a[i]-nums[i]);
        }
        reverse(a);
         for(int i=0;i<n;i++){
            if(a[i]!=nums[i])
            bcost+=Math.abs(a[i]-nums[i]);
        }
        return Math.min(acost,bcost);
    }
}
