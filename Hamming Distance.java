/* Given two integers x, and y return the number of positions where their values differ in their binary representations as a 32-bit integer.*/
import java.util.*;

class Solution {
    public int solve(int x, int y) {
         return Integer.bitCount(x ^ y);
    }
}
