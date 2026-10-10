package pstj_week3;

import java.time.LocalDate;

public class DayoftheYear {

    public static int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.getDayOfYear();
    }

    public static void main(String[] args) {
        // Test with Example 1
        String date = "2019-01-09";
        
        int result = dayOfYear(date);
        
        System.out.println("Day of the year: " + result);
    }
}