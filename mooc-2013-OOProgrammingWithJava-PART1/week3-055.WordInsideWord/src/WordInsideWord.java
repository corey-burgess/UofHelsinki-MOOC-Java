
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.nextLine();
        System.out.println("Type the second word: ");
        String sec = reader.nextLine();


        if (first.indexOf(sec) != -1) {
            System.out.println("The word '" + sec + "' is found in the word '" + first +"'.");
        }else {
            System.out.println("The word '" + sec + "' is not found in the word '" + first +"'.");
        }
    }
}
