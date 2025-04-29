import java.util.Scanner;


//Find the second smallest element.
public class problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            int input = scanner.nextInt();
            arr[i] = input;
        }
        
        int min_value = arr[0];
        int min_value_2 = Integer.MAX_VALUE;

        for(int number : arr) {
            if (number < min_value) {
                int temp = min_value;
                min_value = number;
                min_value_2 = temp;
            } else if (number < min_value_2 && min_value != number) {
                min_value_2 = number;
            }
        }

        if (min_value_2 == Integer.MAX_VALUE) {
            System.out.println("No second smallest");
        } else {
            System.out.print("Smallest number: " + min_value + "\n" + "Second Smallest number: " + min_value_2);
        }
         
    }
}
