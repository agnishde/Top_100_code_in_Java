//Check Whether a Number is Even or Odd in Java

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            if(x%2==0){
                System.out.println("It is a even number");
            }
            else
            {
                System.out.println("It is a odd number");
            }
            //String y = x % 2 == 0 ? " is Even" : " is Odd";System.out.println (x+y)//Alternative method
        }
        
    }
    
}
