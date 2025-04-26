import java.util.Scanner;

//Count digits in a number.
public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int counter = 0;

        while(input > 0) {
            input /= 10;
            counter++;
        }
        
        System.out.println("There are " + counter + " digits in the number");
    }
}
