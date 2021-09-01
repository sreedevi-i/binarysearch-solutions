/* Given a list of integers nums, pack consecutive elements of the same value into sublists.

Note: If there's only one occurrence in the list it should still be in its own sublist.*/
import java.util.*;

class Solution {
    public int[][] solve(int[] arr) {
        int n = 1, a = 0;
        if (arr.length == 0)
            return new int[0][0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                n++;
        }
        int ans[][];
        ans = new int[n][];

        int i, j, ct = 1, k, t = 0;
        for (i = 0; i < arr.length; i++) {
            ct = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ct++;
                } else
                    break;
            }

            ans[t++] = new int[ct];
            for (k = 0; k < ct; k++) {
                ans[a][k] = arr[i];
            }
            a++;
            i = i + ct - 1;
        }
        return ans;
    }
}
