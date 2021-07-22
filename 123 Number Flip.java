import java.util.*;

class Solution {
    public int solve(int n) {
        int n1 = n, n2 = n, count = 0, sum = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            count++;
            sum = sum * 10 + rem;
        }

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            int rem = n1 % 10;
            n1 /= 10;
            arr[i] = rem;
        }

        for (int i = count - 1; i >= 0; i--) {
            if (arr[i] != 3) {
                arr[i] = 3;
                break;
            }
        }

        int ans = 0;

        for (int i = count - 1; i >= 0; i--) {
            ans = ans * 10;
            ans += arr[i];
        }

        return ans;
        
    }
}
