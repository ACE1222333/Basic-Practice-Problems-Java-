import java.util.Scanner;



//Reverse the digits of a number (e.g., 123 → 321).
public class problem13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();


        String reversed = "";

        while (input > 0) {
            reversed += input%10;
            input /= 10;
            
        }
        System.out.print(reversed);


    }
}
