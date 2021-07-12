/* You're given a string s consisting solely of "(" and ")". Return whether the parentheses are balanced.*/
import java.util.*;

class Solution {
    public boolean solve(String s) {
        Stack<Character> st=new Stack<Character>();
        int n=s.length();
        if(n%2!=0)
        return false;
      int c=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
           c++;
            else if(c==0)
            return false;
            else{
             c--;
        }
        }
        
       
        return c==0;


    }
}
