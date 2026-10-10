package pstj_week2;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        // Test with Example 1
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int k = removeElement(nums, val);
        
        System.out.println("Output k: " + k);
        System.out.println("Modified array nums: " + Arrays.toString(nums));
    }
}