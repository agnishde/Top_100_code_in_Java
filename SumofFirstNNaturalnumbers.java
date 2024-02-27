//Find the Sum of First N Natural Numbers using java

import java.util.Scanner;

public class SumofFirstNNaturalnumbers {
    public static void main(String[] args){
        System.out.println("Enter a Number");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int sum=0;
            for(int i =1;i<=x;i++)
                sum += i;
                System.out.println(sum);
                //System.out.println ( n*(n+1)/2) //alternative method   
        }
    }
}
