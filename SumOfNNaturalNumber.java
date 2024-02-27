import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args){
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int x= sc.nextInt();
            int sum = 0;
            for(int i=0;i<=x;i++){
            sum += i;
   }
            System.out.println(sum);
        }
    }
    
    
}
