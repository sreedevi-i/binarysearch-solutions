/* Given a complete binary tree root, return the number of nodes in the tree.*/
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        if(root==null)
        return 0
        int l=1+solve(root.left);
        int r=solve(root.right);
        return l+r;
    }
}
