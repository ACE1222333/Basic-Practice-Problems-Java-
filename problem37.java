import java.util.Scanner;
// /Reverse a string without using a library function.
public class problem37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        String newString = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            newString += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("New String: " + newString);
        

        
    }
}
