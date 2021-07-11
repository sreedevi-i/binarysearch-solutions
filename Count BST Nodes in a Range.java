/* Given a binary search tree root, and integers lo and hi, return the count of all nodes in root whose values are between [lo, hi] (inclusive).*/
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int lo, int hi) {
         if(root==null)
         return 0;
         if(root.val>=lo && root.val<=hi){
            return 1+solve(root.left,lo,hi)+ solve(root.right, lo, hi);
            }
         else if (root.val < lo) {
            return solve(root.right, lo, hi);
        } else {
            return solve(root.left, lo, hi);
        }
       
       
        

    }
}
