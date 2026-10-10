package pstj_week2;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current number to the existing subarray 
            // or start a new subarray from the current number
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the overall maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        // Test with Example 1
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int result = maxSubArray(nums);
        
        System.out.println("Maximum Subarray Sum: " + result);
    }
}