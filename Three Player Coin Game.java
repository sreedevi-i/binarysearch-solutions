/* Medium

You are given a list of non-negative integers piles where each piles[i] represents the number of coins on pile i. In each move, you can do the following until there's no more coins:

Pick any 3 piles from piles
A friend will take the pile with the maximum number of coins
You will take the next highest pile
A friend will take the last pile
Return the maximum number of coins you can acquire.*/
import java.util.*;

class Solution {
    public int solve(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int total = n / 3;
        int index = n - 2, ret = 0;
    while (total>0) {
        ret += piles[index];
        index -= 2;
        total--;
    }
    return ret;
            

        
    }
}
