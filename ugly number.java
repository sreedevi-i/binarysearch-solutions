
/* Given an integer n, return whether its prime factors only include 2, 3 or 5*/
import java.util.*;


class Solution {
    public ArrayList<Integer> fac(int n){
        ArrayList<Integer> a=new ArrayList<Integer>();
          for (int i = 2; i * i <= n; i++) {
    if (n%i == 0){
         a.add(i);
         while (n%i == 0) 
        n /= i;
       

    }

          }

           if (n > 1)
           a.add(n);
          return a;
    }
    public boolean solve(int n) {
        if(n<1)
        return false;
        ArrayList<Integer> a=fac(n);
      int m=a.size();
      for(int i=0;i<m;i++){
          if(a.get(i)!=2 && a.get(i)!=3 && a.get(i)!=5)
          return false;
      }

        return true;
    }
}
