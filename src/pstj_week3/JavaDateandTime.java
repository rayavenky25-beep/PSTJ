package pstj_week2;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        // Create a LocalDate instance using the provided year, month, and day
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the day of the week and convert it to uppercase string
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        String result = findDay(month, day, year);
        
        System.out.println("Day of the week: " + result);
        scanner.close();
    }
}