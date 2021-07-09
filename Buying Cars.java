/* Given a list of integers prices representing prices of cars for sale, and a budget k, return the maximum number of cars you can buy.*/
import java.util.*;

class Solution {
    public int solve(int[] prices, int k) {
        int ans=0,price=0;
        int n=prices.length;
        if(n==1){
           if( prices[0]<=k)
           return 1;
           return 0;
        }
        Arrays.sort(prices);
        for(int i:prices){
            if(i<=k){
                price+=i;
           
            if(price<=k)
            ans++; }
            if(price>k)
            break;
        }
        return ans;
    }
}
