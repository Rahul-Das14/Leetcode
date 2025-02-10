import java.util.*;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i, left, right, len, temp = 0;

        left = m - 1;
        right = n-1;
        len=m+n-1;

        while (left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
                nums1[len]=nums1[left];
                left--;
            }

            else
            {
                nums1[len]=nums2[right];
                right--;
            }

            len--;
        }

        while (right >= 0) {
            nums1[len] = nums2[right];
            right--;
            len--;
        }

    }
}