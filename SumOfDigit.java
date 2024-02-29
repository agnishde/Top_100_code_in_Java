// sum of digit
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        System.out.println("Enter the dgit:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            while(n!=0){
                int rem = n%10;
                sum = sum+rem;
                n=n/10;
            }

            System.out.println(sum);
        }

    }
    
}
