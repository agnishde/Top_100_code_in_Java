//Check if a Number is Positive or Negative in Java

import java.util.Scanner;

public class PositiveOrNegative{
public static void main(String[]args){
    System.out.println("Enter a number:");
    try (Scanner scn = new Scanner(System.in)) {
        int x =scn.nextInt();
        
        if(x>0){
            System.out.println("It is a positive number");
        }
        else if(x<0){
        System.out.println("It is a negative number");
        }
        else
        System.out.println("It is a zero");
    }

}
}