import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) 
    {
        int temp=x;
        int reverse=0,dig;

        while(x!=0)
        {
            if(x<0)
                return false;
            dig=x%10;
                  // Check for overflow/underflow before updating `reversed`
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && dig > 7)) {
                return false;  // Overflow
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && dig < -8)) {
                return false;  // Underflow
            }

            reverse=dig+reverse*10;
            x=x/10;
        }
    if(reverse==temp)
        return true;
    else
    return false;
    }
}
