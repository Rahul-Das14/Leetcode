class Solution {
    public int missingNumber(int[] nums) {
        int i,digit=0,sum=0;
        sum=(nums.length)*(nums.length+1)/2;
        for(i=0;i<nums.length;i++)
        {
            digit=digit+nums[i];
        }
        return (sum-digit);

    }
}