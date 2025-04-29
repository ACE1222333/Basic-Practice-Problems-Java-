import java.util.Scanner;

public class tictactoe {

    public static void print(char[] arr, int move) {


        
        arr[move - 1] = 'X';
        System.out.println("|   " + arr[0] + "   |   " + arr[1] + "   |   " + arr[2] + "   |");
        System.out.println("|   " + arr[3] + "   |   " + arr[4] + "   |   " + arr[5] + "   |");
        System.out.println("|   " + arr[6] + "   |   " + arr[7] + "   |   " + arr[8] + "   |");
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = new char[9];

        while(true) {
            
            System.out.print("Enter a Move (1-9): ");
            int move = scanner.nextInt();
            print(arr, move);
        }
        




    }
}
