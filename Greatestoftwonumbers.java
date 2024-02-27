//Greatest of two numbers

import java.util.Scanner;

public class Greatestoftwonumbers {
    
    public static void main(String[] args){
        System.out.println("Enter your first number:");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Enter your second number:");
            int y = sc.nextInt();
            if(x>y){
                System.out.println( x + "is greater" );
            }
            else if(x<y){
                System.out.println(y + "is greater");
            }
            else
            System.out.println("Both are Equal");
        }
    }
}
