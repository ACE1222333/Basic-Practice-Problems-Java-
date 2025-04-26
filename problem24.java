import java.util.Scanner;

//Check if a number is an Armstrong number.
public class problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int temp = n;
        int counter = 0;

        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        temp = n;


        while (temp != 0) {
            sum += Math.pow(temp % 10, counter);
            temp /= 10;

        }

        if (sum == n) {
            System.out.println(n + " is an armstong number");
        } else {
            System.out.println(n + " is not an armstrong number");
        }




    }
}
