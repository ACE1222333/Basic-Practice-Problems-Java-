

//Search for an element in an array.

import java.util.Scanner;

public class problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter a number to search in array: ");
        int input = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                found = true;
            }
        }

        if (found) {
            System.out.println("The number is in the array");
        } else {
            System.out.println("The number is not in the array");
        }
    

    }
}
