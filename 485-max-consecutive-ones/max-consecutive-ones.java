class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,count=0,maxcount=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                if(count>maxcount)
                {
                    maxcount=count;
                }
                count=0;
            }
        }
    if(count>maxcount)
    {
        maxcount=count;
    }
    return maxcount;
    }
}