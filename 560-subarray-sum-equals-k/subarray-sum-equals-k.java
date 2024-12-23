class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int n = nums.length;
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0,count=0;
        sumMap.put(0,1);
        for (int i = 0; i < n; i++) 
        {
            sum += nums[i];

            int rem = sum - k;
            if (sumMap.containsKey(rem)) 
            {
                count+=sumMap.getOrDefault(rem,0);
            }

            sumMap.put(sum, sumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}