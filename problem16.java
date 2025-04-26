

//Print a triangle of * with n rows.

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (j - i > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int l = i; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
