
//Pass an array to a function and print it.

import java.util.Random;

public class problem34 {

    public static void print(int[] arr) {
        System.out.println("Numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 31);
        }

        print(arr);
    }
}
