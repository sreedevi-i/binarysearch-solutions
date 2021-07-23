import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
        
         LLNode head=node;
        HashSet<Integer> h=new HashSet<Integer>();
       
        while(node!=null && node.next!=null){
            h.add(node.val);
            if(h.contains(node.next.val)){
                node.next=node.next.next;
              
            }else
         
            node=node.next;
        }
    
        return head;
    }
}
