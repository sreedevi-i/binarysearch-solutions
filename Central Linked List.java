/* Given a singly linked list node, return the value of the middle node. If there's two middle nodes, then return the second one.*/
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        LLNode p1=node;
        LLNode p2=node;
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        return p1.val;
        
    }
}
