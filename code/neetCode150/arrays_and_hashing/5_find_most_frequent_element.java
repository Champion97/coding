import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public int findMostFrequent(int[] nums) {
        // Create a HashMap to count the occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Initialize variables to keep track of the most frequent element and its count
        int mostFrequent = nums[0];
        int maxCount = 1;

        // Iterate through the array
        for (int num : nums) {
            // Update the frequency count in the HashMap
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            // Update the most frequent element and its count if necessary
            if (count > maxCount) {
                mostFrequent = num;
                maxCount = count;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        MostFrequentElement solution = new MostFrequentElement();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int mostFrequent = solution.findMostFrequent(nums);
        System.out.println("Most frequent element: " + mostFrequent);
    }
}

