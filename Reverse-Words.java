/* Given a string s of words delimited by spaces, reverse the order of words. */
import java.util.*;

class Solution {
    public String solve(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
         sb.append(words[words.length-1]);
        for (int i=words.length-2; i >=0 ; i--)
        {
          sb.append(" ");
          sb.append(words[i]);
          
        }
        return sb.toString();

    }
}
