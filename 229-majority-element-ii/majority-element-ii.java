import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int firEle = -9999, secEle = -9999; // Default invalid values

        // Step 1: Identify potential majority elements
        for (int num : nums) {
            if (firEle == num) {
                count1++;
            } else if (secEle == num) {
                count2++;
            } else if (count1 == 0) {
                firEle = num;
                count1 = 1;
            } else if (count2 == 0) {
                secEle = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify counts of the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == firEle) {
                count1++;
            } else if (num == secEle) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) {
            ans.add(firEle);
        }
        if (count2 > n / 3) {
            ans.add(secEle);
        }

        return ans;
    }
}
