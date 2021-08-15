/* Given a binary tree root where each node contains a digit from 0-9, return whether its in-order traversal is a palindrome.*/
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root) {
        if (root == null)
            return false;
        Deque<Integer> deque = new LinkedList();
        dfs(root, deque);
        while (!deque.isEmpty() && deque.size() > 1) {
            if (deque.peekFirst() != deque.peekLast())
                return false;
            deque.pollLast();
            deque.pollFirst();
        }
        return true;
    }
    private void dfs(Tree node, Deque<Integer> deque) {
        if (node != null) {
            dfs(node.left, deque);
            deque.addLast(node.val);
            dfs(node.right, deque);
        }
    }
}
