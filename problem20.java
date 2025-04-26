import java.util.Scanner;

//Find all prime numbers up to n.
public class problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();



        for (int i = 2; i <=n; i++) {
            int counter = 1;
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    counter++;
                } 
                if (counter == 2) {
                    break;
                }
            }

            if (counter < 2) {
                System.out.print(i + " ");
            }
        }
    }
}
