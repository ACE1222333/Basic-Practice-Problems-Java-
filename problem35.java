

public class problem35 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 101);


        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

        int max = arr[0];
        
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max Element: " + max);
    }
}
