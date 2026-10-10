package pstj_week3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberofDaysBetweenTwoDates {

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        
        // Find the absolute difference in days between the two dates
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        // Test with Example 1
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        
        int result = daysBetweenDates(date1, date2);
        
        System.out.println("Number of days between: " + result);
    }
}