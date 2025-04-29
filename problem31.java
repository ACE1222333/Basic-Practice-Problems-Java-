

//Check if an array is a palindrome.

import java.util.Scanner;.....

public class problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
ylo
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number for index " + i + ": ");
            int input = scanner.nextInt();
            arr[i] = input;
        }

        int j = size - 1;
        boolean isPalindrome = true;wfffffffffhhhhhhhhhhh .

        for (int number : arr) {
            if (number != arr[j--]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }

        scanner.close();
    }
}
