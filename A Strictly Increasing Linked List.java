/**Given a two-dimensional integer list intervals of the form [start, end] representing intervals (inclusive), return their intersection, that is, the interval that lies within all of the given intervals.

You can assume that the intersection will be non-empty.

Constraints
1 ≤ n ≤ 100,000 where n is the length of intervals

Example 1

Input
intervals = [
    [1, 100],
    [10, 50],
    [15, 65]
]

Output
[15, 50]

Explanation
Consider the ranges [1, 100], [10, 50], [15, 65] on a line. The range [15, 50] is the only interval that is included by all of them.

*/

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
