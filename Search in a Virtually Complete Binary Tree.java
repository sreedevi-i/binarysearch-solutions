/* Consider a complete binary tree of n nodes whose values are 1 to n. The root has value of 1, its left child is 2 and its right child is 3. In general, nodes' values are labelled 1 to n in level order traversal.

You are given a binary tree root and an integer target. Given that the root was originally a complete binary tree whose values were labelled as described above, and that some of the subtrees were deleted, return whether target exists in root.*/
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root, int target) {
        if(root==null)
        return false;
        if(root.val==target)
        return true;
        boolean b=solve(root.left,target);
        boolean s=solve(root.right,target);
        return b||s;
        
    }
}
