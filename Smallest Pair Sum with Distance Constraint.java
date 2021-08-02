/* You are given a list of integers nums. Consider any pair of indices i < j such that j - i > 1. Return the smallest pair sum.*/
class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        int min = nums[0];
        int sum = Integer.MAX_VALUE;
        for (int i = 2; i < n; i++) {
            sum = Math.min(sum, nums[i] + min);
            min = Math.min(min, nums[i - 1]);
        }
        return sum;
        
    }
}
