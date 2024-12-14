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
        // int lowerBound = (-1)*(int) Math.pow(2,31);  // Equivalent to -2147483648
        // int upperBound = (int) Math.pow(2, 31) - 1;  // Equivalent to 2147483647

        // Check if x is within the range
        // if (x <= lowerBound && x >= upperBound) 
        // {
        //     return 0;
        // }
        // else
        // {
        //     return reverse;
        // }
    }
}