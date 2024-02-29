// to Check Leap Year or not

// Leap year program in Java
// If the year satisfies either of the conditions, it's considered a leap year -
// 1. The year must be divisible by 400.
// 2. The year must be divisible by 4 but not 100.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year:");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            if(x%400==0){
                System.out.println("Year is leap year");
            }
            else if(x%4==0 && x%100 != 0){
                System.out.println("Year is leap year");
            }
            else {
                System.out.println("Not leap year");
            }
        }
    }
    
}
