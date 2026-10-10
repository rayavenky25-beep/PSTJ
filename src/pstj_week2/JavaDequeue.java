import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        if (!in.hasNextInt()) return;
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] nums = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            
            // Add current element to the sliding window
            deque.offer(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Once the window reaches size m, check unique count and slide the window
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, map.size());
                
                // Remove the oldest element (from the front of the deque)
                int removed = deque.poll();
                map.put(removed, map.get(removed) - 1);
                
                // If its frequency drops to zero, remove it from the map completely
                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }
        }
        
        System.out.println(maxUnique);
        in.close();
    }
}