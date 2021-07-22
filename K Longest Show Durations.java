import java.util.*;
import java.util.stream.*;

class Solution {
public int solve(String[] shows, int[] durations, int k) {
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        int n=shows.length;
        for(int i=0;i<n;i++){
            if(h.containsKey(shows[i]))
            h.put(shows[i],h.get(shows[i])+durations[i]);
            else
            h.put(shows[i],durations[i]);
        }
        int d=0;
      ArrayList<Integer> l = h.values().stream().collect( Collectors.toCollection(ArrayList::new));
      Collections.sort(l);
      n=l.size();
     
               //  System.out.println(n+""+l);
                for(int i=n-k;i<n;i++)
                d+=l.get(i);
       return d;
    }
}
