/* Given a two-dimensional matrix of characters board and a string target, return whether the target can be found in the matrix by going left-to-right, or up-to-down unidirectionally.*/
import java.util.*;

class Solution {
    public boolean solve(String[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for (int i = 0; i < n; i++) {
            StringBuilder sbr = new StringBuilder();
            for (int j = 0; j < m; j++) sbr.append(board[i][j]);
            if (sbr.toString().contains(word))
                return true;
        }
        for (int i = 0; i < m; i++) {
            StringBuilder sbr = new StringBuilder();
            for (int j = 0; j < n; j++) sbr.append(board[j][i]);
            if (sbr.toString().contains(word))
                return true;
        }
        return false;
        
    }
}
