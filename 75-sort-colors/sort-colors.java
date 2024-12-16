class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length;
        int i,low = 0, mid = 0, high = n - 1; // 3 pointers
        ArrayList<Integer> arr = new ArrayList<>();
        for(i=0;i<nums.length;i++)
        {
            arr.add(nums[i]);
        }
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
        for (i = 0; i < arr.size(); i++)
        {
            nums[i] = arr.get(i);
        }
    }
}