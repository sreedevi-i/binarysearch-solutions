import java.util.*;

/* Given a binary tree root, return an inorder traversal of root as a list.

Bonus: Can you do this iteratively?*/
/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int[] solve(Tree root) {
        Stack<Tree> stack=new Stack<Tree>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        Tree curr=root;
        while(!stack.empty() || curr != null){
            
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
               
                curr = stack.pop();
                a.add(curr.val);
                curr = curr.right;
            }
        }
        int m=a.size();
        int[] k=new int[m];
        for(int i=0;i<m;i++)
        k[i]=a.get(i);
        return k;
        }
        
    }
