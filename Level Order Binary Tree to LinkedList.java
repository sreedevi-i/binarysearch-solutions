import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
     
    
    public LLNode solve(Tree root) {
     
        LLNode head = new LLNode(root.val);
        LLNode curr = head;
        Queue<Tree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Tree node = q.poll();
            if (node.left != null) {
                q.offer(node.left);
                curr.next = new LLNode(node.left.val);
                curr = curr.next;
            }
            if (node.right != null) {
                q.offer(node.right);
                curr.next = new LLNode(node.right.val);
                curr = curr.next;
            }
        }
        return head;
}  
}  

