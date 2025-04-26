import java.util.Scanner;


//Find the maximum of 3 numbers using if-else.
public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("Input 3 Numbers");
        System.out.print("Num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Num 3: ");
        int num3 = scanner.nextInt();

        int max_value = 0;


        if (num1 > num2 && num1 > num3) {
            max_value = num1;
        } else if (num2 > num1 && num2 > num3) {
            max_value = num2;
        } else if (num3 > num1 && num3 > num2) {
            max_value = num3;
        }

        System.out.println("Max Value = " + max_value);


        
    }
}
