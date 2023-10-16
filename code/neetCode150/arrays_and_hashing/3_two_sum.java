//https://leetcode.com/problems/two-sum/submissions/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elementToIndex = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(elementToIndex.containsKey(complement)) {
                return new int[]{elementToIndex.get(complement), i};
            
            }

            elementToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
