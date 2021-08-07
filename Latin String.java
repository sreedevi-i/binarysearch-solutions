import java.util.*;

class Solution {
    public boolean solve(String[][] matrix) {
         int n = matrix.length;
        HashSet<String> hs = new HashSet();

        for (String[] mat : matrix) {
            for (String m : mat) {
                hs.add(m);
            }
        }
        if (hs.size() != n)
            return false;

        for (int i = 0; i < n; i++) {
            HashSet<String> row = new HashSet();
            HashSet<String> col = new HashSet();

            for (int j = 0; j < n; j++) {
                row.add(matrix[i][j]);
                col.add(matrix[j][i]);
            }
            if (row.size() != n)
                return false;
            if (col.size() != n)
                return false;
        }
        return true;
    }
}
