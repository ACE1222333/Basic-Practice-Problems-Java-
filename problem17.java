public class problem17 {

//Print a number triangle (e.g., 1 12 123).
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int counter = 1;
            for (int k = n - 1; k >= 0 ; k--) {
                if (k - i > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            System.out.println("");
        }
    }
}
