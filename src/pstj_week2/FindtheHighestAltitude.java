package pstj_week2;

public class FindtheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }

    public static void main(String[] args) {
        // Test with Example 1
        int[] gain = {-5, 1, 5, 0, -7};
        
        int result = largestAltitude(gain);
        
        System.out.println("Highest Altitude: " + result);
    }
}