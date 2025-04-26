import java.util.Scanner;

public class problem100 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter number on index " + (i + 1) + ": ");
            int input = scanner.nextInt();

            arr[i] = input;
        }


        int max_value = arr[0];

        for(int n : arr) {
            if (n > max_value) {
                max_value = n;
            }
        }

        System.out.print("Max Value: " + max_value);
        System.out.println("Testing");

    }
}
