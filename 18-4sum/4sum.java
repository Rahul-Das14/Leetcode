import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        int i,j,k,l;
        long sum=0;
        Arrays.sort(nums);
        for(i=0;i<n;i++)
        {
            if (i>0 && nums[i] == nums[i - 1]) continue;
            for(j=i+1;j<n;j++)
            {
                if (j>i+1 && nums[j] == nums[j - 1]) continue;

                k=j+1;
                l=n-1;
                while(k<l)
                {
                    sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum==target)
                    {
                        List<Integer> s =new ArrayList<>();
                        s.add(nums[i]);
                        s.add(nums[j]);
                        s.add(nums[k]);
                        s.add(nums[l]);
                        ans.add(s);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])
                            k++;
                        while(k<l && nums[l]==nums[l+1])
                            l--;
                    }

                    else if(sum>target)
                    {
                        l--;
                    }
                    else
                    {
                        k++;   
                    }
                }
            }
        }
        return ans;
    }
}