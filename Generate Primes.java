/* Given a number n, return a list of all prime numbers smaller than or equal to n in ascending order.*/
import java.util.*;

class Solution {
    public boolean is_prime(int N) {
  for (int i = 2; i * i <= N; i ++)
    if (N % i == 0) {
      return false;}
      return true;
    }
    public int[] solve(int n) {
        ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=2;i<=n;i++){
        if(is_prime(i))
        a.add(i);
    }
    int k=a.size();
    int[] m=new int[k];
    for(int i=0;i<k;i++)
    m[i]=a.get(i);
   
    return m;
       

    }
}
