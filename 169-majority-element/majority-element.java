import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {

        int i,value;
        HashMap<Integer, Integer> hsmap = new HashMap<>();


        for (i = 0; i < nums.length; i++) {
            value = hsmap.getOrDefault(nums[i], 0);
            hsmap.put(nums[i], value+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hsmap.entrySet());

        // Searching for the majority element:
        for (i = 0; i < entryList.size(); i++) 
        {
            Map.Entry<Integer, Integer> entry = entryList.get(i);
            if (entry.getValue() > (nums.length/ 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}