//https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > 1)
            return true;
        } 

        return false;

        
    }

//more optimized solution using hashset, instead of hashmap

public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
          if(!set.add(nums[i]))
          return true;
        } 

        return false;

        
    }

}
