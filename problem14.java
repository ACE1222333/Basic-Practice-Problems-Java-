import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        String reversed = "";
        int j = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
           reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");;
        }


    }
}
