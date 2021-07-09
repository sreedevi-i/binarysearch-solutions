/* ou've got an integer n representing a chessboard of size n x n. Return the number of ways you can place n rooks, such that no two rooks attack each other.

Two ways are considered different if in one of the ways, some cell of the chessboard is occupied, and in the other way, the cell is not occupied.

Note: two rooks are attacking each other if they are either on the same row or on the same column.*/
import java.util.*;

class Solution {
    public int solve(int n) {
        int ways=1;
        for(int i=2;i<=n;i++)
        ways*=i;
        return ways;
    }
}
