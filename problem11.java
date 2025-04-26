import java.util.Scanner;

//Check if a number is positive, negative, or zero.

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
    
    
            if (input > 0) {
                System.out.println(input + " is positive");
            } else if (input < 0) {
                System.out.println(input + " is negative");
            } else {
                System.out.println(input + " is zero");
            }
    
            
        }
    }

}
