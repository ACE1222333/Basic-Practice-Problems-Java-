
//Add two arrays element by element
public class problem32 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        System.out.println("\nArray 1: ");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println("\nArray 2: ");
        for (int n : arr2) {
            System.out.print(n + " ");
        }
        System.out.println("\nArray 1 + Array 2 = Array 3: ");
        for (int n : arr3) {
            System.out.print(n + " ");
        }

    }
}
