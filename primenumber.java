//check prime or not

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int p = sc.nextInt();
            int i;
            for(i =2;i<p;i++){
                if(p%i ==0){
                    System.out.println("Number is not prime");
                    break;
                }
            }
            if(i==p){
                System.out.println("number is prime");
            }
        }

    }

}
