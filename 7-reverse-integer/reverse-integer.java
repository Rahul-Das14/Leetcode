import java.lang.Math;
class Solution {
    public int reverse(int x) {
        int reverse=0,dig;

        while(x!=0)
        {
            dig=x%10;
                  // Check for overflow/underflow before updating `reversed`
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0;  // Overflow
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0;  // Underflow
            }

            reverse=dig+reverse*10;
            x=x/10;
        }
        
        return reverse;
    }
}