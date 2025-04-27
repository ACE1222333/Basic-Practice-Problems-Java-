

//Reverse the array.
public class problem30 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverseArr = new int[arr.length];
        int j = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[j--];
        }

        for(int number : reverseArr) {
            System.out.print(number + " ");
        }


    }
}
