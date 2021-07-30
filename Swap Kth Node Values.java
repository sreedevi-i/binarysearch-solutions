/* You are given a singly linked list node and an integer k. Swap the value of the k-th (0-indexed) node from the end with the k-th node from the beginning.*/
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int k) {
        LLNode slow = node;
        LLNode fast = node;
        int c = 0;
        while (c < k && fast.next != null) {
            fast = fast.next;
            c++;
        }
        LLNode first = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        return node;
        
    }
}
