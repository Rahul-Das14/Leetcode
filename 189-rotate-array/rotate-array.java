class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverseArray(nums, 0, nums.length - 1);

        reverseArray(nums, 0, k - 1);

        reverseArray(nums, k, nums.length - 1);
    }

    private void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}