import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private int letter;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        while (i < this.length) {
            password += alphabet.charAt(random.nextInt(25));
            i++;
        }
        return password;
    }
}
