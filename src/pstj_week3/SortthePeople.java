package pstj_week3;

import java.util.Arrays;

public class SortthePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        // Create an array of indices to sort based on heights
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices in descending order of their corresponding heights
        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));

        // Build the sorted names array
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }

    public static void main(String[] args) {
        // Test with Example 1
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        
        String[] result = sortPeople(names, heights);
        
        System.out.println("Sorted People: " + Arrays.toString(result));
    }
}