package pstj_Week1;

import java.util.Scanner;

interface PerformOperation {
    boolean check(int n);
}

class MyMath {

    PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    PerformOperation isPrime() {
        return n -> {
            if (n < 2)
                return false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return n -> {
            int num = n;
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            return rev == n;
        };
    }
}

public class JavaLambdaExpressions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyMath obj = new MyMath();

        int t = sc.nextInt();

        while (t-- > 0) {

            int choice = sc.nextInt();
            int num = sc.nextInt();

            if (choice == 1) {
                if (obj.isOdd().check(num))
                    System.out.println("ODD");
                else
                    System.out.println("EVEN");
            } else if (choice == 2) {
                if (obj.isPrime().check(num))
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");
            } else {
                if (obj.isPalindrome().check(num))
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }

        sc.close();
    }
}