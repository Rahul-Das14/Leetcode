import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        int i,j,k,sum=0;
        Arrays.sort(nums);
        for(i=0;i<n;i++)
        {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            j=i+1;
            k=n-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }

                else if(sum>0)
                {
                    k--;
                }

                else
                {
                    List<Integer> s =new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[j]);
                    s.add(nums[k]);
                    ans.add(s);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }

            }
            
        }
        return ans;
    }
}