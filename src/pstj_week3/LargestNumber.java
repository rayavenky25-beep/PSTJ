package pstj_week3;

import java.util.Arrays;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
        // Convert the integer array to a String array for custom sorting
        String[] sNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }

        // Sort strings based on which concatenated combination is larger (a + b vs b + a)
        Arrays.sort(sNums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", the result is simply "0" (handles cases like [0, 0])
        if (sNums[0].equals("0")) {
            return "0";
        }

        // Build the final combined string
        StringBuilder sb = new StringBuilder();
        for (String s : sNums) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test with Example 1
        int[] nums1 = {10, 2};
        System.out.println("Largest Number: " + largestNumber(nums1)); // Output: "210"

        // Test with Example 2
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Largest Number: " + largestNumber(nums2)); // Output: "9534330"
    }
}