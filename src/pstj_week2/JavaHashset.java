package pstj_week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (!s.hasNextInt()) {
            s.close();
            return;
        }
        
        int t = s.nextInt();
        String[] pair1 = new String[t];
        String[] pair2 = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair1[i] = s.next();
            pair2[i] = s.next();
        }
        
        // Use a HashSet to store unique combined pairs
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            // Combine both strings with a delimiter (e.g., a space or comma) to treat the pair as a single entity
            set.add(pair1[i] + " " + pair2[i]);
            
            // Print the current number of unique pairs
            System.out.println(set.size());
        }
        
        s.close();
    }
}