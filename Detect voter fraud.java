/* Given a two dimensional list of integers votes, where each list has two elements [candidate_id, voter_id], report whether any voter has voted more than once*/
import java.util.*;

class Solution {
    public boolean solve(int[][] votes) {
        int n=votes.length;
        HashSet<Integer> h=new HashSet<Integer>(n);
        for(int[] v:votes){
            if(h.contains(v[1]))
            return true;
            h.add(v[1]);
        }
        return false;
        
    }
}
