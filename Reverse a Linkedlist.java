/* Given a singly linked list node, return its reverse.

Bonus: Can you do this in \mathcal{O}(1)O(1) space?*/
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
        LLNode curr = node, next = null, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    
        
    }
}
