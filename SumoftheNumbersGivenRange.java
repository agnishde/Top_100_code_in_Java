//Find the Sum of the Numbers in a Given Range in Java

import java.util.Scanner;

public class SumoftheNumbersGivenRange {
    public static void main(String[] args){
        System.out.println("Enter first number:");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Enter second number:");
            int y = sc.nextInt();
            int sum =0;
            for(int i=x;i<=y;i++){
                sum += i;
            }
            System.out.println("The sum of the numbers in a given range is:" + sum);
        }

    }
    
}
