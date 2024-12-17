class Solution {
    public int maxSubArray(int[] nums) {

        int i,sum=0,start=0,end=0,largest=-999999;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum<=0)
            {
                sum=0;
                start=i+1;
            }
            if(sum!=0 && sum>largest)
            {
                largest=sum;
                end=i;
            }
        }
        if(largest==-999999)
        {
            for(i=0;i<nums.length;i++)
            {
                largest=Math.max(largest,nums[i]);
            }
        }
        return largest;
    }
}