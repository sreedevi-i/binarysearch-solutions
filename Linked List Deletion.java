import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int target) {
        LLNode prev = node;
        LLNode cur = node.next;
        while (cur != null) {
            LLNode nxt = cur.next;
            if (cur.val == target)
                prev.next = nxt;
            else {
                prev = cur;
            }
            cur = nxt;
        }
        if (node.val == target)
            return node.next;
        return node;
    }
}
