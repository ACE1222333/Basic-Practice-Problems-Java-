

//Print the Fibonacci sequence up to n terms.
public class problem21 {
    public static void main(String[] args) {
        int n = 10;
        int firstNum = 0;
        int secondNum = 1;


        for (int i = 0; i < n; i++) {
            System.out.print(firstNum + " ");
            int temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}
