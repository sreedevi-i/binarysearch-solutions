import java.util.*;

class Solution {
    public String[] solve(String s, int k) {
          String[] result = new String[k];
          Arrays.fill(result,"");
          for (int i = 0; i < s.length(); i++) result[i % k] += s.charAt(i);
        return result;
 
    }
}
