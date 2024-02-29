import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        System.out.println("Enter first range:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("Enter second range:");
            int b = sc.nextInt();
            int x, i;
            for (x = a; x < b; x++) {
                for (i = 2; i < x; i++) {
                    if (x % i == 0) {
                        break;
                    }
                }

                if (i == x) {
                    System.out.println(x);
                }
            }

        }

    }

}
