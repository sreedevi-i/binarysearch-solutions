import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int[] solve(Tree root) {
        Queue<Tree> q=new LinkedList<Tree>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty()){
            Tree t=q.poll();
            a.add(t.val);
        if(t.left!=null)
        q.add(t.left);
        if(t.right!=null)
        q.add(t.right);

        }
        int n=a.size();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=a.get(i);
        return ar;
        
    }
}
