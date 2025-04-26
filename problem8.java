
//Sum of first N natural numbers.

import java.util.Scanner;

public class problem8 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of N: " );
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
    
}
