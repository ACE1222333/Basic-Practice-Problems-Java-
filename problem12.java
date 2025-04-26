import java.util.Scanner;


//Check if a year is a leap year
public class problem12 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year: ");
            int input = scanner.nextInt();
    
            if (input % 400 == 0) {
                System.out.println(input + " is a leap year");
            } else if (input % 4 == 0 && input % 100 != 0) {
                System.out.println(input + " is a leap year");
            } else {
                System.out.println(input + " is not a leap year");
            }   
        }
    }
 
}
