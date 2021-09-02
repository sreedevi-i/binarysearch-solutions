/* Given a list of integers nums, return whether you can split the list into 1 or more groups where:

The size of each group is larger than or equal to 2.
The sizes of all groups are equal.
All the integers in each group are the same.*/
class Solution {
    public boolean solve(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add((entry.getValue()));
            min = Math.min(min, entry.getValue());
        }
        boolean flag = true;
        for (int i = 2; i <= min; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
            flag = true;
        }
        return false;
    }
}
