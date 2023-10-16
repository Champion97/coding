//https://leetcode.com/problems/top-k-frequent-elements/submissions/

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to count the occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a list of lists to store elements grouped by frequency
        List<List<Integer>> buckets = new ArrayList<>();
        
        // Initialize buckets
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        
        // Put elements into buckets based on their frequency
        for (int num : frequencyMap.keySet()) {
            int freq = frequencyMap.get(num);
            buckets.get(freq).add(num);
        }
        
        // Create an array to store the top k frequent elements
        int[] result = new int[k];
        int index = 0;
        
        // Iterate through the buckets in reverse order (higher frequency first)
        for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {
            List<Integer> bucket = buckets.get(i);
            
            // Add elements from the current bucket to the result array
            for (int num : bucket) {
                result[index++] = num;
                if (index >= k) {
                    break;
                }
            }
        }
        
        return result;
    }
}

