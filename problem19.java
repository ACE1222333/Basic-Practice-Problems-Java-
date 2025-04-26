

//Check if a number is prime.

import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            boolean isPrime = true;
    
    
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
    
            if (isPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
    
        }

    }
}
