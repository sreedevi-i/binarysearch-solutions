/* Given a binary search tree root and an integer val, determine whether val is in the tree. */
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root, int val) {
        if(root==null)
        return false;
        if(root.val==val)
        return true;
        if(root.val<val)
        return solve(root.right,val);
        if(root.val>val)
        return solve(root.left,val);
        return false;


    }
}
