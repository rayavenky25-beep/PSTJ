package pstj_week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to char array, sort it, and use it as the key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            
            // If the key doesn't exist, create a new list for it
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            
            // Add the original string to its corresponding anagram group
            map.get(sortedKey).add(s);
        }
        
        // Return all the grouped anagram lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Test with Example 1
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> result = groupAnagrams(strs);
        
        System.out.println("Grouped Anagrams: " + result);
    }
}
