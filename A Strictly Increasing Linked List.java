/*
Given the head of a singly linked list head, return whether the values of the nodes are sorted in a strictly increasing order.

Constraints
1 ≤ n ≤ 100,000 where n is the number of nodes in head.

Example 1:
Input:
head = [1, 5, 9, 9]
Output:
false

Explanation
Even though this list is sorted, it's not strictly increasing since 9 is repeated.*/

import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
       
        while(head.next !=null){
            if(head.val>=head.next.val)
            return false;
             head=head.next;
        }
        return true;
    }
}
