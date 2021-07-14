/* Given a binary tree root, return whether all values in the tree are the same.*/
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
     HashSet<Integer> hs = new HashSet<>();
    public boolean solve(Tree root) {
        same(root);
        return hs.size() == 1;
    }
    public void same(Tree root) {
        if (root == null)
            return;
        hs.add(root.val);
        same(root.left);
        same(root.right);
    
    }
}
