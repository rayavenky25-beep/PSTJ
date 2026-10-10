package pstj_week3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if (!scan.hasNextInt()) {
            scan.close();
            return;
        }
        
        int n = scan.nextInt();
        
        // Create an ArrayList of ArrayLists to store each line's numbers dynamically
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(scan.nextInt());
            }
            lines.add(row);
        }
        
        int q = scan.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); // line number (1-based index)
            int y = scan.nextInt(); // position number (1-based index)
            
            // Adjust to 0-based indexing for ArrayList access
            int lineIndex = x - 1;
            int posIndex = y - 1;
            
            // Check if the line and position exist
            if (lineIndex >= 0 && lineIndex < lines.size() && 
                posIndex >= 0 && posIndex < lines.get(lineIndex).size()) {
                System.out.println(lines.get(lineIndex).get(posIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}