package pstj_week3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayoftheWeek {

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        // Get the full name of the day of the week (e.g., "Saturday")
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static void main(String[] args) {
        // Test with Example 1
        int day = 31, month = 8, year = 2019;
        
        String result = dayOfTheWeek(day, month, year);
        
        System.out.println("Day of the week: " + result);
    }
}