

//Print a hollow square of *.
public class problem18 {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;

        for (int i = 1; i <= width; i++) {
            for(int j = 1; j <= length; j++) {
                if (j == 1 ||i == 1 || j == length || i == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


    }
}
