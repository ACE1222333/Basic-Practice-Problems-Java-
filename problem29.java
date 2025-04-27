

//Count even and odd numbers in an array.
public class problem29 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int odd = 0;
        int even = 0;
        int zero = 0;


        for (int number : arr) {
            if (number == 0) {
                zero++;
            } else if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Odd: " + odd + "\nEven: " + even + "\nZero: " + zero);
    }
}
