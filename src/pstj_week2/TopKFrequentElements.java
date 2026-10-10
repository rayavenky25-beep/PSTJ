package pstj_week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Use a min-heap to keep track of the top k frequent elements
        // Compare elements based on their frequencies
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
        
        for (int num : countMap.keySet()) {
            minHeap.add(num);
            // If heap size exceeds k, remove the least frequent element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // Step 3: Extract elements from the heap into the result array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Test with Example 1
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        
        int[] result = topKFrequent(nums, k);
        
        System.out.println("Top " + k + " Frequent Elements: " + Arrays.toString(result));
    }
}