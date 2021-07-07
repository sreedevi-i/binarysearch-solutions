import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        int r=matrix.length;
        int c=matrix.length;

        int[][] nm=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                nm[i][j]=matrix[j][i];
            }
        }
        return nm;
    }
}
