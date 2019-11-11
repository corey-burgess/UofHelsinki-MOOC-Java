import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random number = new Random();
        int i = 7;
        while (i > 0) {
            int draw = number.nextInt(39) + 1;
            if (!numbers.contains(draw)) {
                numbers.add(draw);
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
