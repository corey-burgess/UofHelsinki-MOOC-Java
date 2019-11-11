import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        boolean pal = true;
        if (text.equals(reverse(text))){
            return true;
        }
        return false;
    }

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = (text.length() -1);
        String help = "";
        while (i >= 0) {
            help = help + text.charAt(i);
            i--;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
