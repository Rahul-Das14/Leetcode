import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Create an array to store the rearranged elements.
        int[] ans = new int[n];

        // Indices for positive and negative elements.
        int posIndex = 0, negIndex = 1;

        // Traverse the array and place positive and negative numbers alternately.
        for (int num : nums) {
            if (num < 0) {
                ans[negIndex] = num;
                negIndex += 2;
            } else {
                ans[posIndex] = num;
                posIndex += 2;
            }
        }

        return ans;
    }
}
