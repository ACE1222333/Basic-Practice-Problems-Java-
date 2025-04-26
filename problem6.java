import java.util.Scanner;


//Simple calculator (add, subtract, multiply, divide).
public class problem6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Input 2 numbers");
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation + - * /");
        char operation;

        while(true) {
            System.out.print("Enter Operation: ");
            operation = scanner.next().charAt(0);
    
            if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                System.out.println("Invalid Input");
                continue;
            }
            break;
        }

        int result = 0;
        switch (operation) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:
                break;
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);


    }
}
