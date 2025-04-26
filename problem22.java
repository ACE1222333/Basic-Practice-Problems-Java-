import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second Number: " );
        int num2 = scanner.nextInt();

        int lowestNum = 0;
        int gcd = 0;

        if (num1 < num2) {
            lowestNum = num1;
        } else {
            lowestNum = num2;
        }

        for (int i = 1; i <= lowestNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = 0;
        int temp1 = num1;
        int temp2 = num2;


       while(true) {
            if (temp1 < temp2) {
                temp1+=num1;
            } else if ( temp2 < temp1) {
                temp2 += num2;
            } else {
                lcm = temp1;
                break;
            }
       }


        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm );
    }
}
