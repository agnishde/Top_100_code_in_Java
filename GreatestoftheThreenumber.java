//Greatest of the Three numbers

import java.util.Scanner;

public class GreatestoftheThreenumber {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Enter your Second number:");
            int y = sc.nextInt();
            System.out.println("Enter third number:");
            int z = sc.nextInt();
            if (x >= y && x >= z) {
                System.out.println("x is greater:" + x);
            } else if (y >= z && y >= x) {
                System.out.println("y is greater:" + y);
            }

            else {
                System.out.println("z is greater:" + z);
            }

        }
    }

}
