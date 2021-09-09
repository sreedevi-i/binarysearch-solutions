import java.util.*;

class Solution {
    public boolean solve(int[][] matrix) {
       
      for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row + 1 < matrix.length && col + 1 < matrix[0].length) {
                    if (matrix[row + 1][col + 1] != matrix[row][col]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
