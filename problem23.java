import java.util.Scanner;


//Sum of digits in a number.
public class problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;

        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Result: " + sum);

    }    
}
