import java.util.*;

class Solution {
    public String solve(String s0, String s1) {
      StringBuilder sb=new StringBuilder();
      int n=s0.length();
      int m=s1.length();
      for(int i=0;i<Math.max(m,n);i++)
      {
          if(i<n)
          sb.append(s0.charAt(i));
          if(i<m)
          sb.append(s1.charAt(i));
      }
      return sb.toString();

        
    }
}
