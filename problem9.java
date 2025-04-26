import java.util.Scanner;


//Factorial of a number.
public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for factorial: ");
        int num = scanner.nextInt();
        int factorial = 1;


        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("!" + num + " = " + factorial);
    }
}

