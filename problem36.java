import java.util.Scanner;


//Count vowels in a string.
public class problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String toLower = word.toLowerCase();

        int vowelCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (toLower.charAt(i) == 'a' || toLower.charAt(i) == 'e' || toLower.charAt(i) == 'i' || toLower.charAt(i) == 'o' || 
            toLower.charAt(i) == 'u') {
                vowelCounter++;
            }
        }

        System.out.print("There are " + vowelCounter + " characters in the word");

    }
}
